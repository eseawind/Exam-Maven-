package cn.xm.exam.bean.trainContent;

import java.util.ArrayList;
import java.util.List;

public class TraincontenttypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraincontenttypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(String value) {
            addCriterion("typeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(String value) {
            addCriterion("typeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(String value) {
            addCriterion("typeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(String value) {
            addCriterion("typeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(String value) {
            addCriterion("typeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(String value) {
            addCriterion("typeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLike(String value) {
            addCriterion("typeId like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotLike(String value) {
            addCriterion("typeId not like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<String> values) {
            addCriterion("typeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<String> values) {
            addCriterion("typeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(String value1, String value2) {
            addCriterion("typeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(String value1, String value2) {
            addCriterion("typeId not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("typeName is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("typeName is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("typeName =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("typeName <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("typeName >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("typeName >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("typeName <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("typeName <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("typeName like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("typeName not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("typeName in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("typeName not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("typeName between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("typeName not between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andUpidIsNull() {
            addCriterion("upId is null");
            return (Criteria) this;
        }

        public Criteria andUpidIsNotNull() {
            addCriterion("upId is not null");
            return (Criteria) this;
        }

        public Criteria andUpidEqualTo(String value) {
            addCriterion("upId =", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotEqualTo(String value) {
            addCriterion("upId <>", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidGreaterThan(String value) {
            addCriterion("upId >", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidGreaterThanOrEqualTo(String value) {
            addCriterion("upId >=", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidLessThan(String value) {
            addCriterion("upId <", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidLessThanOrEqualTo(String value) {
            addCriterion("upId <=", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidLike(String value) {
            addCriterion("upId like", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotLike(String value) {
            addCriterion("upId not like", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidIn(List<String> values) {
            addCriterion("upId in", values, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotIn(List<String> values) {
            addCriterion("upId not in", values, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidBetween(String value1, String value2) {
            addCriterion("upId between", value1, value2, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotBetween(String value1, String value2) {
            addCriterion("upId not between", value1, value2, "upid");
            return (Criteria) this;
        }

        public Criteria andTypedescriptionIsNull() {
            addCriterion("typeDescription is null");
            return (Criteria) this;
        }

        public Criteria andTypedescriptionIsNotNull() {
            addCriterion("typeDescription is not null");
            return (Criteria) this;
        }

        public Criteria andTypedescriptionEqualTo(String value) {
            addCriterion("typeDescription =", value, "typedescription");
            return (Criteria) this;
        }

        public Criteria andTypedescriptionNotEqualTo(String value) {
            addCriterion("typeDescription <>", value, "typedescription");
            return (Criteria) this;
        }

        public Criteria andTypedescriptionGreaterThan(String value) {
            addCriterion("typeDescription >", value, "typedescription");
            return (Criteria) this;
        }

        public Criteria andTypedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("typeDescription >=", value, "typedescription");
            return (Criteria) this;
        }

        public Criteria andTypedescriptionLessThan(String value) {
            addCriterion("typeDescription <", value, "typedescription");
            return (Criteria) this;
        }

        public Criteria andTypedescriptionLessThanOrEqualTo(String value) {
            addCriterion("typeDescription <=", value, "typedescription");
            return (Criteria) this;
        }

        public Criteria andTypedescriptionLike(String value) {
            addCriterion("typeDescription like", value, "typedescription");
            return (Criteria) this;
        }

        public Criteria andTypedescriptionNotLike(String value) {
            addCriterion("typeDescription not like", value, "typedescription");
            return (Criteria) this;
        }

        public Criteria andTypedescriptionIn(List<String> values) {
            addCriterion("typeDescription in", values, "typedescription");
            return (Criteria) this;
        }

        public Criteria andTypedescriptionNotIn(List<String> values) {
            addCriterion("typeDescription not in", values, "typedescription");
            return (Criteria) this;
        }

        public Criteria andTypedescriptionBetween(String value1, String value2) {
            addCriterion("typeDescription between", value1, value2, "typedescription");
            return (Criteria) this;
        }

        public Criteria andTypedescriptionNotBetween(String value1, String value2) {
            addCriterion("typeDescription not between", value1, value2, "typedescription");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}