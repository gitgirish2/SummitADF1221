package oracle.summit.model.multieoupdate;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;

import oracle.summit.base.SummitEntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 27 14:35:35 CDT 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ProductImpl extends SummitEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id {
            public Object get(ProductImpl obj) {
                return obj.getId();
            }

            public void put(ProductImpl obj, Object value) {
                obj.setId((Integer) value);
            }
        }
        ,
        Name {
            public Object get(ProductImpl obj) {
                return obj.getName();
            }

            public void put(ProductImpl obj, Object value) {
                obj.setName((String) value);
            }
        }
        ,
        ShortDesc {
            public Object get(ProductImpl obj) {
                return obj.getShortDesc();
            }

            public void put(ProductImpl obj, Object value) {
                obj.setShortDesc((String) value);
            }
        }
        ,
        LongtextId {
            public Object get(ProductImpl obj) {
                return obj.getLongtextId();
            }

            public void put(ProductImpl obj, Object value) {
                obj.setLongtextId((Integer) value);
            }
        }
        ,
        ImageId {
            public Object get(ProductImpl obj) {
                return obj.getImageId();
            }

            public void put(ProductImpl obj, Object value) {
                obj.setImageId((Integer) value);
            }
        }
        ,
        CategoryId {
            public Object get(ProductImpl obj) {
                return obj.getCategoryId();
            }

            public void put(ProductImpl obj, Object value) {
                obj.setCategoryId((Integer) value);
            }
        }
        ,
        SuggestedWhlslPrice {
            public Object get(ProductImpl obj) {
                return obj.getSuggestedWhlslPrice();
            }

            public void put(ProductImpl obj, Object value) {
                obj.setSuggestedWhlslPrice((BigDecimal) value);
            }
        }
        ,
        WhlslUnits {
            public Object get(ProductImpl obj) {
                return obj.getWhlslUnits();
            }

            public void put(ProductImpl obj, Object value) {
                obj.setWhlslUnits((String) value);
            }
        }
        ,
        Inventory {
            public Object get(ProductImpl obj) {
                return obj.getInventory();
            }

            public void put(ProductImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(ProductImpl object);

        public abstract void put(ProductImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int ID = AttributesEnum.Id.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int SHORTDESC = AttributesEnum.ShortDesc.index();
    public static final int LONGTEXTID = AttributesEnum.LongtextId.index();
    public static final int IMAGEID = AttributesEnum.ImageId.index();
    public static final int CATEGORYID = AttributesEnum.CategoryId.index();
    public static final int SUGGESTEDWHLSLPRICE = AttributesEnum.SuggestedWhlslPrice.index();
    public static final int WHLSLUNITS = AttributesEnum.WhlslUnits.index();
    public static final int INVENTORY = AttributesEnum.Inventory.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ProductImpl() {
    }


    @Override
    protected void create(AttributeList attributeList) {
        // TODO Implement this method
        super.create(attributeList);
    }


    /**
     * Gets the attribute value for Id, using the alias name Id.
     * @return the value of Id
     */
    public Integer getId() {
        return (Integer) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Id.
     * @param value value to set the Id
     */
    public void setId(Integer value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for Name, using the alias name Name.
     * @return the value of Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Name.
     * @param value value to set the Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for ShortDesc, using the alias name ShortDesc.
     * @return the value of ShortDesc
     */
    public String getShortDesc() {
        return (String) getAttributeInternal(SHORTDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShortDesc.
     * @param value value to set the ShortDesc
     */
    public void setShortDesc(String value) {
        setAttributeInternal(SHORTDESC, value);
    }

    /**
     * Gets the attribute value for LongtextId, using the alias name LongtextId.
     * @return the value of LongtextId
     */
    public Integer getLongtextId() {
        return (Integer) getAttributeInternal(LONGTEXTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LongtextId.
     * @param value value to set the LongtextId
     */
    public void setLongtextId(Integer value) {
        setAttributeInternal(LONGTEXTID, value);
    }

    /**
     * Gets the attribute value for ImageId, using the alias name ImageId.
     * @return the value of ImageId
     */
    public Integer getImageId() {
        return (Integer) getAttributeInternal(IMAGEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ImageId.
     * @param value value to set the ImageId
     */
    public void setImageId(Integer value) {
        setAttributeInternal(IMAGEID, value);
    }

    /**
     * Gets the attribute value for CategoryId, using the alias name CategoryId.
     * @return the value of CategoryId
     */
    public Integer getCategoryId() {
        return (Integer) getAttributeInternal(CATEGORYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CategoryId.
     * @param value value to set the CategoryId
     */
    public void setCategoryId(Integer value) {
        setAttributeInternal(CATEGORYID, value);
    }

    /**
     * Gets the attribute value for SuggestedWhlslPrice, using the alias name SuggestedWhlslPrice.
     * @return the value of SuggestedWhlslPrice
     */
    public BigDecimal getSuggestedWhlslPrice() {
        return (BigDecimal) getAttributeInternal(SUGGESTEDWHLSLPRICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SuggestedWhlslPrice.
     * @param value value to set the SuggestedWhlslPrice
     */
    public void setSuggestedWhlslPrice(BigDecimal value) {
        setAttributeInternal(SUGGESTEDWHLSLPRICE, value);
    }

    /**
     * Gets the attribute value for WhlslUnits, using the alias name WhlslUnits.
     * @return the value of WhlslUnits
     */
    public String getWhlslUnits() {
        return (String) getAttributeInternal(WHLSLUNITS);
    }

    /**
     * Sets <code>value</code> as the attribute value for WhlslUnits.
     * @param value value to set the WhlslUnits
     */
    public void setWhlslUnits(String value) {
        setAttributeInternal(WHLSLUNITS, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
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
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getInventory() {
        return (RowIterator) getAttributeInternal(INVENTORY);
    }

    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer id) {
        return new Key(new Object[] { id });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("oracle.summit.model.multieoupdate.Product");
    }
}
