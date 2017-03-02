package oracle.summit.model.entities;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;

import oracle.summit.base.SummitEntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jan 28 12:20:14 GMT 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ItemEOImpl extends SummitEntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        setItemId(nextValSequence("S_ITEM_ID", getDBTransaction()));
        
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        OrdId {
            public Object get(ItemEOImpl obj) {
                return obj.getOrdId();
            }

            public void put(ItemEOImpl obj, Object value) {
                obj.setOrdId((Number)value);
            }
        }
        ,
        ItemId {
            public Object get(ItemEOImpl obj) {
                return obj.getItemId();
            }

            public void put(ItemEOImpl obj, Object value) {
                obj.setItemId((Number)value);
            }
        }
        ,
        ProductId {
            public Object get(ItemEOImpl obj) {
                return obj.getProductId();
            }

            public void put(ItemEOImpl obj, Object value) {
                obj.setProductId((Number)value);
            }
        }
        ,
        Price {
            public Object get(ItemEOImpl obj) {
                return obj.getPrice();
            }

            public void put(ItemEOImpl obj, Object value) {
                obj.setPrice((Number)value);
            }
        }
        ,
        Quantity {
            public Object get(ItemEOImpl obj) {
                return obj.getQuantity();
            }

            public void put(ItemEOImpl obj, Object value) {
                obj.setQuantity((Number)value);
            }
        }
        ,
        QuantityShipped {
            public Object get(ItemEOImpl obj) {
                return obj.getQuantityShipped();
            }

            public void put(ItemEOImpl obj, Object value) {
                obj.setQuantityShipped((Number)value);
            }
        }
        ,
        OrdEO {
            public Object get(ItemEOImpl obj) {
                return obj.getOrdEO();
            }

            public void put(ItemEOImpl obj, Object value) {
                obj.setOrdEO((OrdEOImpl)value);
            }
        }
        ,
        ProductEO {
            public Object get(ItemEOImpl obj) {
                return obj.getProductEO();
            }

            public void put(ItemEOImpl obj, Object value) {
                obj.setProductEO((ProductEOImpl)value);
            }
        }
        ,
        OrdEO1 {
            public Object get(ItemEOImpl obj) {
                return obj.getOrdEO1();
            }

            public void put(ItemEOImpl obj, Object value) {
                obj.setOrdEO1((OrdEOImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(ItemEOImpl object);

        public abstract void put(ItemEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() +
                AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ORDID = AttributesEnum.OrdId.index();
    public static final int ITEMID = AttributesEnum.ItemId.index();
    public static final int PRODUCTID = AttributesEnum.ProductId.index();
    public static final int PRICE = AttributesEnum.Price.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int QUANTITYSHIPPED = AttributesEnum.QuantityShipped.index();
    public static final int ORDEO = AttributesEnum.OrdEO.index();
    public static final int PRODUCTEO = AttributesEnum.ProductEO.index();
    public static final int ORDEO1 = AttributesEnum.OrdEO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ItemEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("oracle.summit.model.entities.ItemEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for OrdId, using the alias name OrdId.
     * @return the OrdId
     */
    public Number getOrdId() {
        return (Number)getAttributeInternal(ORDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrdId.
     * @param value value to set the OrdId
     */
    public void setOrdId(Number value) {
        setAttributeInternal(ORDID, value);
    }

    /**
     * Gets the attribute value for ItemId, using the alias name ItemId.
     * @return the ItemId
     */
    public Number getItemId() {
        return (Number)getAttributeInternal(ITEMID);
    }


    /**
     * Sets <code>value</code> as the attribute value for ItemId.
     * @param value value to set the ItemId
     */
    public void setItemId(Number value) {
        setAttributeInternal(ITEMID, value);
    }

    /**
     * Gets the attribute value for ProductId, using the alias name ProductId.
     * @return the ProductId
     */
    public Number getProductId() {
        return (Number)getAttributeInternal(PRODUCTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProductId.
     * @param value value to set the ProductId
     */
    public void setProductId(Number value) {
        setAttributeInternal(PRODUCTID, value);

        //Code added to set the item price to be the wholesale price of the new product..
        ProductEOImpl prodInfo = (ProductEOImpl)getProductEO();
        setPrice(prodInfo.getSuggestedWhlslPrice());
    }

    /**
     * Gets the attribute value for Price, using the alias name Price.
     * @return the Price
     */
    public Number getPrice() {
        return (Number)getAttributeInternal(PRICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Price.
     * @param value value to set the Price
     */
    public void setPrice(Number value) {
        //    When ever this attribute is changed, the order total has to be updated as this is based
        //    on the line item, which is the price * quantity.

        //Get the price before you change it
        Number oldPrice = getPrice();

        //When adding a new line you won't have an oldPrice
        if (oldPrice == null) {
            oldPrice = new Number(0);
        }

        setAttributeInternal(PRICE, value);

        //Recalculate the order total if the price changes.
        OrdEOImpl order = getOrdEO();
        //First of all remove the the old line item total from the order total
        Number orderTotal =
            order.getTotal().subtract(getQuantity().multiply(oldPrice));

        //Now add the new line item total
        order.setTotal(orderTotal.add(getQuantity().multiply(value)));

    }

    /**
     * Gets the attribute value for Quantity, using the alias name Quantity.
     * @return the Quantity
     */
    public Number getQuantity() {
        return (Number)getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Quantity.
     * @param value value to set the Quantity
     */
    public void setQuantity(Number value) {

        Number oldQuantity = getQuantity();
        setAttributeInternal(QUANTITY, value);

        //Recalculate the order total if the quantity changes.
        OrdEOImpl order = getOrdEO();
        //First of all remove the the old line item total from the order total
        Number orderTotal =
            order.getTotal().subtract(getPrice().multiply(oldQuantity));

        //Now add the new line item total
        order.setTotal(orderTotal.add(getPrice().multiply(value)));


    }

    /**
     * Gets the attribute value for QuantityShipped, using the alias name QuantityShipped.
     * @return the QuantityShipped
     */
    public Number getQuantityShipped() {
        return (Number)getAttributeInternal(QUANTITYSHIPPED);

    }

    /**
     * Sets <code>value</code> as the attribute value for QuantityShipped.
     * @param value value to set the QuantityShipped
     */
    public void setQuantityShipped(Number value) {

        //    When ever this attribute is changed, the order total has to be updated as this is based
        //    on the line item, which is the price * quantityShipped.

        //Get the quantityShipped before you change it
        Number oldQuantity = getQuantityShipped();
        setAttributeInternal(QUANTITYSHIPPED, value);

        //Recalculate the order total if the price changes.
        OrdEOImpl order = (OrdEOImpl)getOrdEO();
        //First of all remove the the old line item total from the order total
        Number orderTotal =
            order.getTotal().subtract(getPrice().multiply(oldQuantity));

        //Now add the new line item total
        order.setTotal(orderTotal.add(getPrice().multiply(value)));
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity oracle.summit.base.SummitEntityImpl.
     */
    public OrdEOImpl getOrdEO() {
        return (OrdEOImpl)getAttributeInternal(ORDEO);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.summit.base.SummitEntityImpl.
     */
    public void setOrdEO(OrdEOImpl value) {
        setAttributeInternal(ORDEO, value);
    }

    /**
     * @return the associated entity oracle.summit.base.SummitEntityImpl.
     */
    public ProductEOImpl getProductEO() {
        return (ProductEOImpl)getAttributeInternal(PRODUCTEO);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.summit.base.SummitEntityImpl.
     */
    public void setProductEO(ProductEOImpl value) {
        setAttributeInternal(PRODUCTEO, value);
    }

    /**
     * @return the associated entity OrdEOImpl.
     */
    public OrdEOImpl getOrdEO1() {
        return (OrdEOImpl)getAttributeInternal(ORDEO1);
    }

    /**
     * Sets <code>value</code> as the associated entity OrdEOImpl.
     */
    public void setOrdEO1(OrdEOImpl value) {
        setAttributeInternal(ORDEO1, value);
    }

    /**
     * @param itemId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number itemId) {
        return new Key(new Object[]{itemId});
    }


}
