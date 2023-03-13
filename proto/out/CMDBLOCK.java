// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CMD_BLOCK.proto

public final class CMDBLOCK {
  private CMDBLOCK() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface CMD_BLOCKOrBuilder
      extends com.google.protobuf.MessageLiteOrBuilder {
    
    // required .QueueAction actionRequested_ = 1;
    boolean hasActionRequested();
    QueueMessage.QueueAction getActionRequested();
    
    // required int64 blockID = 2;
    boolean hasBlockID();
    long getBlockID();
    
    // required bool isProcessed = 3;
    boolean hasIsProcessed();
    boolean getIsProcessed();
    
    // required .FIR_ORDER_CHANGE firOrderChange_ = 4;
    boolean hasFirOrderChange();
    QueueMessage.FIR_ORDER_CHANGE getFirOrderChange();
  }
  public static final class CMD_BLOCK extends
      com.google.protobuf.GeneratedMessageLite
      implements CMD_BLOCKOrBuilder {
    // Use CMD_BLOCK.newBuilder() to construct.
    private CMD_BLOCK(Builder builder) {
      super(builder);
    }
    private CMD_BLOCK(boolean noInit) {}
    
    private static final CMD_BLOCK defaultInstance;
    public static CMD_BLOCK getDefaultInstance() {
      return defaultInstance;
    }
    
    public CMD_BLOCK getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    private int bitField0_;
    // required .QueueAction actionRequested_ = 1;
    public static final int ACTIONREQUESTED__FIELD_NUMBER = 1;
    private QueueMessage.QueueAction actionRequested_;
    public boolean hasActionRequested() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public QueueMessage.QueueAction getActionRequested() {
      return actionRequested_;
    }
    
    // required int64 blockID = 2;
    public static final int BLOCKID_FIELD_NUMBER = 2;
    private long blockID_;
    public boolean hasBlockID() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getBlockID() {
      return blockID_;
    }
    
    // required bool isProcessed = 3;
    public static final int ISPROCESSED_FIELD_NUMBER = 3;
    private boolean isProcessed_;
    public boolean hasIsProcessed() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public boolean getIsProcessed() {
      return isProcessed_;
    }
    
    // required .FIR_ORDER_CHANGE firOrderChange_ = 4;
    public static final int FIRORDERCHANGE__FIELD_NUMBER = 4;
    private QueueMessage.FIR_ORDER_CHANGE firOrderChange_;
    public boolean hasFirOrderChange() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public QueueMessage.FIR_ORDER_CHANGE getFirOrderChange() {
      return firOrderChange_;
    }
    
    private void initFields() {
      actionRequested_ = QueueMessage.QueueAction.NO_ACTION_VALUE;
      blockID_ = 0L;
      isProcessed_ = false;
      firOrderChange_ = QueueMessage.FIR_ORDER_CHANGE.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasActionRequested()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBlockID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIsProcessed()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFirOrderChange()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getFirOrderChange().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, actionRequested_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, blockID_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, isProcessed_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, firOrderChange_);
      }
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, actionRequested_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, blockID_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isProcessed_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, firOrderChange_);
      }
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static CMDBLOCK.CMD_BLOCK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static CMDBLOCK.CMD_BLOCK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static CMDBLOCK.CMD_BLOCK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static CMDBLOCK.CMD_BLOCK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static CMDBLOCK.CMD_BLOCK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static CMDBLOCK.CMD_BLOCK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static CMDBLOCK.CMD_BLOCK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static CMDBLOCK.CMD_BLOCK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static CMDBLOCK.CMD_BLOCK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static CMDBLOCK.CMD_BLOCK parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(CMDBLOCK.CMD_BLOCK prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          CMDBLOCK.CMD_BLOCK, Builder>
        implements CMDBLOCK.CMD_BLOCKOrBuilder {
      // Construct using CMDBLOCK.CMD_BLOCK.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private void maybeForceBuilderInitialization() {
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        actionRequested_ = QueueMessage.QueueAction.NO_ACTION_VALUE;
        bitField0_ = (bitField0_ & ~0x00000001);
        blockID_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        isProcessed_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        firOrderChange_ = QueueMessage.FIR_ORDER_CHANGE.getDefaultInstance();
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public CMDBLOCK.CMD_BLOCK getDefaultInstanceForType() {
        return CMDBLOCK.CMD_BLOCK.getDefaultInstance();
      }
      
      public CMDBLOCK.CMD_BLOCK build() {
        CMDBLOCK.CMD_BLOCK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private CMDBLOCK.CMD_BLOCK buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        CMDBLOCK.CMD_BLOCK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public CMDBLOCK.CMD_BLOCK buildPartial() {
        CMDBLOCK.CMD_BLOCK result = new CMDBLOCK.CMD_BLOCK(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.actionRequested_ = actionRequested_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.blockID_ = blockID_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.isProcessed_ = isProcessed_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.firOrderChange_ = firOrderChange_;
        result.bitField0_ = to_bitField0_;
        return result;
      }
      
      public Builder mergeFrom(CMDBLOCK.CMD_BLOCK other) {
        if (other == CMDBLOCK.CMD_BLOCK.getDefaultInstance()) return this;
        if (other.hasActionRequested()) {
          setActionRequested(other.getActionRequested());
        }
        if (other.hasBlockID()) {
          setBlockID(other.getBlockID());
        }
        if (other.hasIsProcessed()) {
          setIsProcessed(other.getIsProcessed());
        }
        if (other.hasFirOrderChange()) {
          mergeFirOrderChange(other.getFirOrderChange());
        }
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasActionRequested()) {
          
          return false;
        }
        if (!hasBlockID()) {
          
          return false;
        }
        if (!hasIsProcessed()) {
          
          return false;
        }
        if (!hasFirOrderChange()) {
          
          return false;
        }
        if (!getFirOrderChange().isInitialized()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              
              return this;
            default: {
              if (!parseUnknownField(input, extensionRegistry, tag)) {
                
                return this;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              QueueMessage.QueueAction value = QueueMessage.QueueAction.valueOf(rawValue);
              if (value != null) {
                bitField0_ |= 0x00000001;
                actionRequested_ = value;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              blockID_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              isProcessed_ = input.readBool();
              break;
            }
            case 34: {
              QueueMessage.FIR_ORDER_CHANGE.Builder subBuilder = QueueMessage.FIR_ORDER_CHANGE.newBuilder();
              if (hasFirOrderChange()) {
                subBuilder.mergeFrom(getFirOrderChange());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setFirOrderChange(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .QueueAction actionRequested_ = 1;
      private QueueMessage.QueueAction actionRequested_ = QueueMessage.QueueAction.NO_ACTION_VALUE;
      public boolean hasActionRequested() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public QueueMessage.QueueAction getActionRequested() {
        return actionRequested_;
      }
      public Builder setActionRequested(QueueMessage.QueueAction value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        actionRequested_ = value;
        
        return this;
      }
      public Builder clearActionRequested() {
        bitField0_ = (bitField0_ & ~0x00000001);
        actionRequested_ = QueueMessage.QueueAction.NO_ACTION_VALUE;
        
        return this;
      }
      
      // required int64 blockID = 2;
      private long blockID_ ;
      public boolean hasBlockID() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getBlockID() {
        return blockID_;
      }
      public Builder setBlockID(long value) {
        bitField0_ |= 0x00000002;
        blockID_ = value;
        
        return this;
      }
      public Builder clearBlockID() {
        bitField0_ = (bitField0_ & ~0x00000002);
        blockID_ = 0L;
        
        return this;
      }
      
      // required bool isProcessed = 3;
      private boolean isProcessed_ ;
      public boolean hasIsProcessed() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public boolean getIsProcessed() {
        return isProcessed_;
      }
      public Builder setIsProcessed(boolean value) {
        bitField0_ |= 0x00000004;
        isProcessed_ = value;
        
        return this;
      }
      public Builder clearIsProcessed() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isProcessed_ = false;
        
        return this;
      }
      
      // required .FIR_ORDER_CHANGE firOrderChange_ = 4;
      private QueueMessage.FIR_ORDER_CHANGE firOrderChange_ = QueueMessage.FIR_ORDER_CHANGE.getDefaultInstance();
      public boolean hasFirOrderChange() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public QueueMessage.FIR_ORDER_CHANGE getFirOrderChange() {
        return firOrderChange_;
      }
      public Builder setFirOrderChange(QueueMessage.FIR_ORDER_CHANGE value) {
        if (value == null) {
          throw new NullPointerException();
        }
        firOrderChange_ = value;
        
        bitField0_ |= 0x00000008;
        return this;
      }
      public Builder setFirOrderChange(
          QueueMessage.FIR_ORDER_CHANGE.Builder builderForValue) {
        firOrderChange_ = builderForValue.build();
        
        bitField0_ |= 0x00000008;
        return this;
      }
      public Builder mergeFirOrderChange(QueueMessage.FIR_ORDER_CHANGE value) {
        if (((bitField0_ & 0x00000008) == 0x00000008) &&
            firOrderChange_ != QueueMessage.FIR_ORDER_CHANGE.getDefaultInstance()) {
          firOrderChange_ =
            QueueMessage.FIR_ORDER_CHANGE.newBuilder(firOrderChange_).mergeFrom(value).buildPartial();
        } else {
          firOrderChange_ = value;
        }
        
        bitField0_ |= 0x00000008;
        return this;
      }
      public Builder clearFirOrderChange() {
        firOrderChange_ = QueueMessage.FIR_ORDER_CHANGE.getDefaultInstance();
        
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:CMD_BLOCK)
    }
    
    static {
      defaultInstance = new CMD_BLOCK(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:CMD_BLOCK)
  }
  
  
  static {
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}