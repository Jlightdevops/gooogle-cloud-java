// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1/language_service.proto

package com.google.cloud.language.v1;

public interface PartOfSpeechOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1.PartOfSpeech)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The part of speech tag.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Tag tag = 1;</code>
   * @return The enum numeric value on the wire for tag.
   */
  int getTagValue();
  /**
   * <pre>
   * The part of speech tag.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Tag tag = 1;</code>
   * @return The tag.
   */
  com.google.cloud.language.v1.PartOfSpeech.Tag getTag();

  /**
   * <pre>
   * The grammatical aspect.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Aspect aspect = 2;</code>
   * @return The enum numeric value on the wire for aspect.
   */
  int getAspectValue();
  /**
   * <pre>
   * The grammatical aspect.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Aspect aspect = 2;</code>
   * @return The aspect.
   */
  com.google.cloud.language.v1.PartOfSpeech.Aspect getAspect();

  /**
   * <pre>
   * The grammatical case.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Case case = 3;</code>
   * @return The enum numeric value on the wire for case.
   */
  int getCaseValue();
  /**
   * <pre>
   * The grammatical case.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Case case = 3;</code>
   * @return The case.
   */
  com.google.cloud.language.v1.PartOfSpeech.Case getCase();

  /**
   * <pre>
   * The grammatical form.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Form form = 4;</code>
   * @return The enum numeric value on the wire for form.
   */
  int getFormValue();
  /**
   * <pre>
   * The grammatical form.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Form form = 4;</code>
   * @return The form.
   */
  com.google.cloud.language.v1.PartOfSpeech.Form getForm();

  /**
   * <pre>
   * The grammatical gender.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Gender gender = 5;</code>
   * @return The enum numeric value on the wire for gender.
   */
  int getGenderValue();
  /**
   * <pre>
   * The grammatical gender.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Gender gender = 5;</code>
   * @return The gender.
   */
  com.google.cloud.language.v1.PartOfSpeech.Gender getGender();

  /**
   * <pre>
   * The grammatical mood.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Mood mood = 6;</code>
   * @return The enum numeric value on the wire for mood.
   */
  int getMoodValue();
  /**
   * <pre>
   * The grammatical mood.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Mood mood = 6;</code>
   * @return The mood.
   */
  com.google.cloud.language.v1.PartOfSpeech.Mood getMood();

  /**
   * <pre>
   * The grammatical number.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Number number = 7;</code>
   * @return The enum numeric value on the wire for number.
   */
  int getNumberValue();
  /**
   * <pre>
   * The grammatical number.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Number number = 7;</code>
   * @return The number.
   */
  com.google.cloud.language.v1.PartOfSpeech.Number getNumber();

  /**
   * <pre>
   * The grammatical person.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Person person = 8;</code>
   * @return The enum numeric value on the wire for person.
   */
  int getPersonValue();
  /**
   * <pre>
   * The grammatical person.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Person person = 8;</code>
   * @return The person.
   */
  com.google.cloud.language.v1.PartOfSpeech.Person getPerson();

  /**
   * <pre>
   * The grammatical properness.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Proper proper = 9;</code>
   * @return The enum numeric value on the wire for proper.
   */
  int getProperValue();
  /**
   * <pre>
   * The grammatical properness.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Proper proper = 9;</code>
   * @return The proper.
   */
  com.google.cloud.language.v1.PartOfSpeech.Proper getProper();

  /**
   * <pre>
   * The grammatical reciprocity.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Reciprocity reciprocity = 10;</code>
   * @return The enum numeric value on the wire for reciprocity.
   */
  int getReciprocityValue();
  /**
   * <pre>
   * The grammatical reciprocity.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Reciprocity reciprocity = 10;</code>
   * @return The reciprocity.
   */
  com.google.cloud.language.v1.PartOfSpeech.Reciprocity getReciprocity();

  /**
   * <pre>
   * The grammatical tense.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Tense tense = 11;</code>
   * @return The enum numeric value on the wire for tense.
   */
  int getTenseValue();
  /**
   * <pre>
   * The grammatical tense.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Tense tense = 11;</code>
   * @return The tense.
   */
  com.google.cloud.language.v1.PartOfSpeech.Tense getTense();

  /**
   * <pre>
   * The grammatical voice.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Voice voice = 12;</code>
   * @return The enum numeric value on the wire for voice.
   */
  int getVoiceValue();
  /**
   * <pre>
   * The grammatical voice.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech.Voice voice = 12;</code>
   * @return The voice.
   */
  com.google.cloud.language.v1.PartOfSpeech.Voice getVoice();
}
