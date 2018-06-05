/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.sentry.hdfs.service.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class TAuthzUpdateRequest implements org.apache.thrift.TBase<TAuthzUpdateRequest, TAuthzUpdateRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TAuthzUpdateRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAuthzUpdateRequest");

  private static final org.apache.thrift.protocol.TField PERM_SEQ_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("permSeqNum", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField PATH_SEQ_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("pathSeqNum", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField PATH_IMG_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("pathImgNum", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TAuthzUpdateRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TAuthzUpdateRequestTupleSchemeFactory());
  }

  private long permSeqNum; // required
  private long pathSeqNum; // required
  private long pathImgNum; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PERM_SEQ_NUM((short)1, "permSeqNum"),
    PATH_SEQ_NUM((short)2, "pathSeqNum"),
    PATH_IMG_NUM((short)3, "pathImgNum");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PERM_SEQ_NUM
          return PERM_SEQ_NUM;
        case 2: // PATH_SEQ_NUM
          return PATH_SEQ_NUM;
        case 3: // PATH_IMG_NUM
          return PATH_IMG_NUM;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PERMSEQNUM_ISSET_ID = 0;
  private static final int __PATHSEQNUM_ISSET_ID = 1;
  private static final int __PATHIMGNUM_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PERM_SEQ_NUM, new org.apache.thrift.meta_data.FieldMetaData("permSeqNum", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PATH_SEQ_NUM, new org.apache.thrift.meta_data.FieldMetaData("pathSeqNum", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PATH_IMG_NUM, new org.apache.thrift.meta_data.FieldMetaData("pathImgNum", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAuthzUpdateRequest.class, metaDataMap);
  }

  public TAuthzUpdateRequest() {
  }

  public TAuthzUpdateRequest(
    long permSeqNum,
    long pathSeqNum,
    long pathImgNum)
  {
    this();
    this.permSeqNum = permSeqNum;
    setPermSeqNumIsSet(true);
    this.pathSeqNum = pathSeqNum;
    setPathSeqNumIsSet(true);
    this.pathImgNum = pathImgNum;
    setPathImgNumIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAuthzUpdateRequest(TAuthzUpdateRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.permSeqNum = other.permSeqNum;
    this.pathSeqNum = other.pathSeqNum;
    this.pathImgNum = other.pathImgNum;
  }

  public TAuthzUpdateRequest deepCopy() {
    return new TAuthzUpdateRequest(this);
  }

  @Override
  public void clear() {
    setPermSeqNumIsSet(false);
    this.permSeqNum = 0;
    setPathSeqNumIsSet(false);
    this.pathSeqNum = 0;
    setPathImgNumIsSet(false);
    this.pathImgNum = 0;
  }

  public long getPermSeqNum() {
    return this.permSeqNum;
  }

  public void setPermSeqNum(long permSeqNum) {
    this.permSeqNum = permSeqNum;
    setPermSeqNumIsSet(true);
  }

  public void unsetPermSeqNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PERMSEQNUM_ISSET_ID);
  }

  /** Returns true if field permSeqNum is set (has been assigned a value) and false otherwise */
  public boolean isSetPermSeqNum() {
    return EncodingUtils.testBit(__isset_bitfield, __PERMSEQNUM_ISSET_ID);
  }

  public void setPermSeqNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PERMSEQNUM_ISSET_ID, value);
  }

  public long getPathSeqNum() {
    return this.pathSeqNum;
  }

  public void setPathSeqNum(long pathSeqNum) {
    this.pathSeqNum = pathSeqNum;
    setPathSeqNumIsSet(true);
  }

  public void unsetPathSeqNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PATHSEQNUM_ISSET_ID);
  }

  /** Returns true if field pathSeqNum is set (has been assigned a value) and false otherwise */
  public boolean isSetPathSeqNum() {
    return EncodingUtils.testBit(__isset_bitfield, __PATHSEQNUM_ISSET_ID);
  }

  public void setPathSeqNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PATHSEQNUM_ISSET_ID, value);
  }

  public long getPathImgNum() {
    return this.pathImgNum;
  }

  public void setPathImgNum(long pathImgNum) {
    this.pathImgNum = pathImgNum;
    setPathImgNumIsSet(true);
  }

  public void unsetPathImgNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PATHIMGNUM_ISSET_ID);
  }

  /** Returns true if field pathImgNum is set (has been assigned a value) and false otherwise */
  public boolean isSetPathImgNum() {
    return EncodingUtils.testBit(__isset_bitfield, __PATHIMGNUM_ISSET_ID);
  }

  public void setPathImgNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PATHIMGNUM_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PERM_SEQ_NUM:
      if (value == null) {
        unsetPermSeqNum();
      } else {
        setPermSeqNum((Long)value);
      }
      break;

    case PATH_SEQ_NUM:
      if (value == null) {
        unsetPathSeqNum();
      } else {
        setPathSeqNum((Long)value);
      }
      break;

    case PATH_IMG_NUM:
      if (value == null) {
        unsetPathImgNum();
      } else {
        setPathImgNum((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PERM_SEQ_NUM:
      return getPermSeqNum();

    case PATH_SEQ_NUM:
      return getPathSeqNum();

    case PATH_IMG_NUM:
      return getPathImgNum();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PERM_SEQ_NUM:
      return isSetPermSeqNum();
    case PATH_SEQ_NUM:
      return isSetPathSeqNum();
    case PATH_IMG_NUM:
      return isSetPathImgNum();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TAuthzUpdateRequest)
      return this.equals((TAuthzUpdateRequest)that);
    return false;
  }

  public boolean equals(TAuthzUpdateRequest that) {
    if (that == null)
      return false;

    boolean this_present_permSeqNum = true;
    boolean that_present_permSeqNum = true;
    if (this_present_permSeqNum || that_present_permSeqNum) {
      if (!(this_present_permSeqNum && that_present_permSeqNum))
        return false;
      if (this.permSeqNum != that.permSeqNum)
        return false;
    }

    boolean this_present_pathSeqNum = true;
    boolean that_present_pathSeqNum = true;
    if (this_present_pathSeqNum || that_present_pathSeqNum) {
      if (!(this_present_pathSeqNum && that_present_pathSeqNum))
        return false;
      if (this.pathSeqNum != that.pathSeqNum)
        return false;
    }

    boolean this_present_pathImgNum = true;
    boolean that_present_pathImgNum = true;
    if (this_present_pathImgNum || that_present_pathImgNum) {
      if (!(this_present_pathImgNum && that_present_pathImgNum))
        return false;
      if (this.pathImgNum != that.pathImgNum)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_permSeqNum = true;
    list.add(present_permSeqNum);
    if (present_permSeqNum)
      list.add(permSeqNum);

    boolean present_pathSeqNum = true;
    list.add(present_pathSeqNum);
    if (present_pathSeqNum)
      list.add(pathSeqNum);

    boolean present_pathImgNum = true;
    list.add(present_pathImgNum);
    if (present_pathImgNum)
      list.add(pathImgNum);

    return list.hashCode();
  }

  @Override
  public int compareTo(TAuthzUpdateRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPermSeqNum()).compareTo(other.isSetPermSeqNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPermSeqNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.permSeqNum, other.permSeqNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPathSeqNum()).compareTo(other.isSetPathSeqNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPathSeqNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pathSeqNum, other.pathSeqNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPathImgNum()).compareTo(other.isSetPathImgNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPathImgNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pathImgNum, other.pathImgNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TAuthzUpdateRequest(");
    boolean first = true;

    sb.append("permSeqNum:");
    sb.append(this.permSeqNum);
    first = false;
    if (!first) sb.append(", ");
    sb.append("pathSeqNum:");
    sb.append(this.pathSeqNum);
    first = false;
    if (!first) sb.append(", ");
    sb.append("pathImgNum:");
    sb.append(this.pathImgNum);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetPermSeqNum()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'permSeqNum' is unset! Struct:" + toString());
    }

    if (!isSetPathSeqNum()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'pathSeqNum' is unset! Struct:" + toString());
    }

    if (!isSetPathImgNum()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'pathImgNum' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TAuthzUpdateRequestStandardSchemeFactory implements SchemeFactory {
    public TAuthzUpdateRequestStandardScheme getScheme() {
      return new TAuthzUpdateRequestStandardScheme();
    }
  }

  private static class TAuthzUpdateRequestStandardScheme extends StandardScheme<TAuthzUpdateRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAuthzUpdateRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PERM_SEQ_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.permSeqNum = iprot.readI64();
              struct.setPermSeqNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PATH_SEQ_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.pathSeqNum = iprot.readI64();
              struct.setPathSeqNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PATH_IMG_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.pathImgNum = iprot.readI64();
              struct.setPathImgNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAuthzUpdateRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PERM_SEQ_NUM_FIELD_DESC);
      oprot.writeI64(struct.permSeqNum);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PATH_SEQ_NUM_FIELD_DESC);
      oprot.writeI64(struct.pathSeqNum);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PATH_IMG_NUM_FIELD_DESC);
      oprot.writeI64(struct.pathImgNum);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAuthzUpdateRequestTupleSchemeFactory implements SchemeFactory {
    public TAuthzUpdateRequestTupleScheme getScheme() {
      return new TAuthzUpdateRequestTupleScheme();
    }
  }

  private static class TAuthzUpdateRequestTupleScheme extends TupleScheme<TAuthzUpdateRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAuthzUpdateRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.permSeqNum);
      oprot.writeI64(struct.pathSeqNum);
      oprot.writeI64(struct.pathImgNum);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAuthzUpdateRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.permSeqNum = iprot.readI64();
      struct.setPermSeqNumIsSet(true);
      struct.pathSeqNum = iprot.readI64();
      struct.setPathSeqNumIsSet(true);
      struct.pathImgNum = iprot.readI64();
      struct.setPathImgNumIsSet(true);
    }
  }

}

