// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CMD_BLOCK.proto

#ifndef PROTOBUF_CMD_5fBLOCK_2eproto__INCLUDED
#define PROTOBUF_CMD_5fBLOCK_2eproto__INCLUDED

#include <string>

#include <google/protobuf/stubs/common.h>

#if GOOGLE_PROTOBUF_VERSION < 2004000
#error This file was generated by a newer version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please update
#error your headers.
#endif
#if 2004001 < GOOGLE_PROTOBUF_MIN_PROTOC_VERSION
#error This file was generated by an older version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please
#error regenerate this file with a newer version of protoc.
#endif

#include <google/protobuf/generated_message_util.h>
#include <google/protobuf/repeated_field.h>
#include <google/protobuf/extension_set.h>
#include "mg.pb.h"
// @@protoc_insertion_point(includes)

// Internal implementation detail -- do not call these.
void  protobuf_AddDesc_CMD_5fBLOCK_2eproto();
void protobuf_AssignDesc_CMD_5fBLOCK_2eproto();
void protobuf_ShutdownFile_CMD_5fBLOCK_2eproto();

class CMD_BLOCK;

// ===================================================================

class CMD_BLOCK : public ::google::protobuf::MessageLite {
 public:
  CMD_BLOCK();
  virtual ~CMD_BLOCK();
  
  CMD_BLOCK(const CMD_BLOCK& from);
  
  inline CMD_BLOCK& operator=(const CMD_BLOCK& from) {
    CopyFrom(from);
    return *this;
  }
  
  static const CMD_BLOCK& default_instance();
  
  void Swap(CMD_BLOCK* other);
  
  // implements Message ----------------------------------------------
  
  CMD_BLOCK* New() const;
  void CheckTypeAndMergeFrom(const ::google::protobuf::MessageLite& from);
  void CopyFrom(const CMD_BLOCK& from);
  void MergeFrom(const CMD_BLOCK& from);
  void Clear();
  bool IsInitialized() const;
  
  int ByteSize() const;
  bool MergePartialFromCodedStream(
      ::google::protobuf::io::CodedInputStream* input);
  void SerializeWithCachedSizes(
      ::google::protobuf::io::CodedOutputStream* output) const;
  int GetCachedSize() const { return _cached_size_; }
  private:
  void SharedCtor();
  void SharedDtor();
  void SetCachedSize(int size) const;
  public:
  
  ::std::string GetTypeName() const;
  
  // nested types ----------------------------------------------------
  
  // accessors -------------------------------------------------------
  
  // required int32 sss = 1;
  inline bool has_sss() const;
  inline void clear_sss();
  static const int kSssFieldNumber = 1;
  inline ::google::protobuf::int32 sss() const;
  inline void set_sss(::google::protobuf::int32 value);
  
  // required .MAGIC_CODE mm = 2;
  inline bool has_mm() const;
  inline void clear_mm();
  static const int kMmFieldNumber = 2;
  inline const ::MAGIC_CODE& mm() const;
  inline ::MAGIC_CODE* mutable_mm();
  inline ::MAGIC_CODE* release_mm();
  
  // @@protoc_insertion_point(class_scope:CMD_BLOCK)
 private:
  inline void set_has_sss();
  inline void clear_has_sss();
  inline void set_has_mm();
  inline void clear_has_mm();
  
  ::MAGIC_CODE* mm_;
  ::google::protobuf::int32 sss_;
  
  mutable int _cached_size_;
  ::google::protobuf::uint32 _has_bits_[(2 + 31) / 32];
  
  friend void  protobuf_AddDesc_CMD_5fBLOCK_2eproto();
  friend void protobuf_AssignDesc_CMD_5fBLOCK_2eproto();
  friend void protobuf_ShutdownFile_CMD_5fBLOCK_2eproto();
  
  void InitAsDefaultInstance();
  static CMD_BLOCK* default_instance_;
};
// ===================================================================


// ===================================================================

// CMD_BLOCK

// required int32 sss = 1;
inline bool CMD_BLOCK::has_sss() const {
  return (_has_bits_[0] & 0x00000001u) != 0;
}
inline void CMD_BLOCK::set_has_sss() {
  _has_bits_[0] |= 0x00000001u;
}
inline void CMD_BLOCK::clear_has_sss() {
  _has_bits_[0] &= ~0x00000001u;
}
inline void CMD_BLOCK::clear_sss() {
  sss_ = 0;
  clear_has_sss();
}
inline ::google::protobuf::int32 CMD_BLOCK::sss() const {
  return sss_;
}
inline void CMD_BLOCK::set_sss(::google::protobuf::int32 value) {
  set_has_sss();
  sss_ = value;
}

// required .MAGIC_CODE mm = 2;
inline bool CMD_BLOCK::has_mm() const {
  return (_has_bits_[0] & 0x00000002u) != 0;
}
inline void CMD_BLOCK::set_has_mm() {
  _has_bits_[0] |= 0x00000002u;
}
inline void CMD_BLOCK::clear_has_mm() {
  _has_bits_[0] &= ~0x00000002u;
}
inline void CMD_BLOCK::clear_mm() {
  if (mm_ != NULL) mm_->::MAGIC_CODE::Clear();
  clear_has_mm();
}
inline const ::MAGIC_CODE& CMD_BLOCK::mm() const {
  return mm_ != NULL ? *mm_ : *default_instance_->mm_;
}
inline ::MAGIC_CODE* CMD_BLOCK::mutable_mm() {
  set_has_mm();
  if (mm_ == NULL) mm_ = new ::MAGIC_CODE;
  return mm_;
}
inline ::MAGIC_CODE* CMD_BLOCK::release_mm() {
  clear_has_mm();
  ::MAGIC_CODE* temp = mm_;
  mm_ = NULL;
  return temp;
}


// @@protoc_insertion_point(namespace_scope)

// @@protoc_insertion_point(global_scope)

#endif  // PROTOBUF_CMD_5fBLOCK_2eproto__INCLUDED