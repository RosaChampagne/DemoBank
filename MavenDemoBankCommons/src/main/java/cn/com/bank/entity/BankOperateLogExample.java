package cn.com.bank.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankOperateLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankOperateLogExample() {
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

        public Criteria andOpLgIdIsNull() {
            addCriterion("op_lg_id is null");
            return (Criteria) this;
        }

        public Criteria andOpLgIdIsNotNull() {
            addCriterion("op_lg_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpLgIdEqualTo(Integer value) {
            addCriterion("op_lg_id =", value, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpLgIdNotEqualTo(Integer value) {
            addCriterion("op_lg_id <>", value, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpLgIdGreaterThan(Integer value) {
            addCriterion("op_lg_id >", value, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpLgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_lg_id >=", value, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpLgIdLessThan(Integer value) {
            addCriterion("op_lg_id <", value, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpLgIdLessThanOrEqualTo(Integer value) {
            addCriterion("op_lg_id <=", value, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpLgIdIn(List<Integer> values) {
            addCriterion("op_lg_id in", values, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpLgIdNotIn(List<Integer> values) {
            addCriterion("op_lg_id not in", values, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpLgIdBetween(Integer value1, Integer value2) {
            addCriterion("op_lg_id between", value1, value2, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpLgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("op_lg_id not between", value1, value2, "opLgId");
            return (Criteria) this;
        }

        public Criteria andOpIdIsNull() {
            addCriterion("op_id is null");
            return (Criteria) this;
        }

        public Criteria andOpIdIsNotNull() {
            addCriterion("op_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpIdEqualTo(Integer value) {
            addCriterion("op_id =", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotEqualTo(Integer value) {
            addCriterion("op_id <>", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdGreaterThan(Integer value) {
            addCriterion("op_id >", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_id >=", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdLessThan(Integer value) {
            addCriterion("op_id <", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdLessThanOrEqualTo(Integer value) {
            addCriterion("op_id <=", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdIn(List<Integer> values) {
            addCriterion("op_id in", values, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotIn(List<Integer> values) {
            addCriterion("op_id not in", values, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdBetween(Integer value1, Integer value2) {
            addCriterion("op_id between", value1, value2, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("op_id not between", value1, value2, "opId");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeIsNull() {
            addCriterion("op_lg_time is null");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeIsNotNull() {
            addCriterion("op_lg_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeEqualTo(Date value) {
            addCriterion("op_lg_time =", value, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeNotEqualTo(Date value) {
            addCriterion("op_lg_time <>", value, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeGreaterThan(Date value) {
            addCriterion("op_lg_time >", value, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("op_lg_time >=", value, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeLessThan(Date value) {
            addCriterion("op_lg_time <", value, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeLessThanOrEqualTo(Date value) {
            addCriterion("op_lg_time <=", value, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeIn(List<Date> values) {
            addCriterion("op_lg_time in", values, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeNotIn(List<Date> values) {
            addCriterion("op_lg_time not in", values, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeBetween(Date value1, Date value2) {
            addCriterion("op_lg_time between", value1, value2, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLgTimeNotBetween(Date value1, Date value2) {
            addCriterion("op_lg_time not between", value1, value2, "opLgTime");
            return (Criteria) this;
        }

        public Criteria andOpLogTypeIsNull() {
            addCriterion("op_log_type is null");
            return (Criteria) this;
        }

        public Criteria andOpLogTypeIsNotNull() {
            addCriterion("op_log_type is not null");
            return (Criteria) this;
        }

        public Criteria andOpLogTypeEqualTo(Integer value) {
            addCriterion("op_log_type =", value, "opLogType");
            return (Criteria) this;
        }

        public Criteria andOpLogTypeNotEqualTo(Integer value) {
            addCriterion("op_log_type <>", value, "opLogType");
            return (Criteria) this;
        }

        public Criteria andOpLogTypeGreaterThan(Integer value) {
            addCriterion("op_log_type >", value, "opLogType");
            return (Criteria) this;
        }

        public Criteria andOpLogTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_log_type >=", value, "opLogType");
            return (Criteria) this;
        }

        public Criteria andOpLogTypeLessThan(Integer value) {
            addCriterion("op_log_type <", value, "opLogType");
            return (Criteria) this;
        }

        public Criteria andOpLogTypeLessThanOrEqualTo(Integer value) {
            addCriterion("op_log_type <=", value, "opLogType");
            return (Criteria) this;
        }

        public Criteria andOpLogTypeIn(List<Integer> values) {
            addCriterion("op_log_type in", values, "opLogType");
            return (Criteria) this;
        }

        public Criteria andOpLogTypeNotIn(List<Integer> values) {
            addCriterion("op_log_type not in", values, "opLogType");
            return (Criteria) this;
        }

        public Criteria andOpLogTypeBetween(Integer value1, Integer value2) {
            addCriterion("op_log_type between", value1, value2, "opLogType");
            return (Criteria) this;
        }

        public Criteria andOpLogTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("op_log_type not between", value1, value2, "opLogType");
            return (Criteria) this;
        }

        public Criteria andOpLogResultIsNull() {
            addCriterion("op_log_result is null");
            return (Criteria) this;
        }

        public Criteria andOpLogResultIsNotNull() {
            addCriterion("op_log_result is not null");
            return (Criteria) this;
        }

        public Criteria andOpLogResultEqualTo(Integer value) {
            addCriterion("op_log_result =", value, "opLogResult");
            return (Criteria) this;
        }

        public Criteria andOpLogResultNotEqualTo(Integer value) {
            addCriterion("op_log_result <>", value, "opLogResult");
            return (Criteria) this;
        }

        public Criteria andOpLogResultGreaterThan(Integer value) {
            addCriterion("op_log_result >", value, "opLogResult");
            return (Criteria) this;
        }

        public Criteria andOpLogResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_log_result >=", value, "opLogResult");
            return (Criteria) this;
        }

        public Criteria andOpLogResultLessThan(Integer value) {
            addCriterion("op_log_result <", value, "opLogResult");
            return (Criteria) this;
        }

        public Criteria andOpLogResultLessThanOrEqualTo(Integer value) {
            addCriterion("op_log_result <=", value, "opLogResult");
            return (Criteria) this;
        }

        public Criteria andOpLogResultIn(List<Integer> values) {
            addCriterion("op_log_result in", values, "opLogResult");
            return (Criteria) this;
        }

        public Criteria andOpLogResultNotIn(List<Integer> values) {
            addCriterion("op_log_result not in", values, "opLogResult");
            return (Criteria) this;
        }

        public Criteria andOpLogResultBetween(Integer value1, Integer value2) {
            addCriterion("op_log_result between", value1, value2, "opLogResult");
            return (Criteria) this;
        }

        public Criteria andOpLogResultNotBetween(Integer value1, Integer value2) {
            addCriterion("op_log_result not between", value1, value2, "opLogResult");
            return (Criteria) this;
        }

        public Criteria andOpLogDescIsNull() {
            addCriterion("op_log_desc is null");
            return (Criteria) this;
        }

        public Criteria andOpLogDescIsNotNull() {
            addCriterion("op_log_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOpLogDescEqualTo(String value) {
            addCriterion("op_log_desc =", value, "opLogDesc");
            return (Criteria) this;
        }

        public Criteria andOpLogDescNotEqualTo(String value) {
            addCriterion("op_log_desc <>", value, "opLogDesc");
            return (Criteria) this;
        }

        public Criteria andOpLogDescGreaterThan(String value) {
            addCriterion("op_log_desc >", value, "opLogDesc");
            return (Criteria) this;
        }

        public Criteria andOpLogDescGreaterThanOrEqualTo(String value) {
            addCriterion("op_log_desc >=", value, "opLogDesc");
            return (Criteria) this;
        }

        public Criteria andOpLogDescLessThan(String value) {
            addCriterion("op_log_desc <", value, "opLogDesc");
            return (Criteria) this;
        }

        public Criteria andOpLogDescLessThanOrEqualTo(String value) {
            addCriterion("op_log_desc <=", value, "opLogDesc");
            return (Criteria) this;
        }

        public Criteria andOpLogDescLike(String value) {
            addCriterion("op_log_desc like", value, "opLogDesc");
            return (Criteria) this;
        }

        public Criteria andOpLogDescNotLike(String value) {
            addCriterion("op_log_desc not like", value, "opLogDesc");
            return (Criteria) this;
        }

        public Criteria andOpLogDescIn(List<String> values) {
            addCriterion("op_log_desc in", values, "opLogDesc");
            return (Criteria) this;
        }

        public Criteria andOpLogDescNotIn(List<String> values) {
            addCriterion("op_log_desc not in", values, "opLogDesc");
            return (Criteria) this;
        }

        public Criteria andOpLogDescBetween(String value1, String value2) {
            addCriterion("op_log_desc between", value1, value2, "opLogDesc");
            return (Criteria) this;
        }

        public Criteria andOpLogDescNotBetween(String value1, String value2) {
            addCriterion("op_log_desc not between", value1, value2, "opLogDesc");
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