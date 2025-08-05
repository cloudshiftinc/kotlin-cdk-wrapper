@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An activity is a task that you write in any programming language and host on any machine that has
 * access to AWS Step Functions .
 *
 * Activities must poll Step Functions using the `GetActivityTask` API action and respond using
 * `SendTask*` API actions. This function makes Step Functions aware of your activity and returns an
 * identifier for use in a state machine and when polling from the activity.
 *
 * For information about creating an activity, see [Creating an Activity State
 * Machine](https://docs.aws.amazon.com/step-functions/latest/dg/tutorial-creating-activity-state-machine.html)
 * in the *AWS Step Functions Developer Guide* and
 * [CreateActivity](https://docs.aws.amazon.com/step-functions/latest/apireference/API_CreateActivity.html)
 * in the *AWS Step Functions API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * CfnActivity cfnActivity = CfnActivity.Builder.create(this, "MyCfnActivity")
 * .name("name")
 * // the properties below are optional
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .kmsDataKeyReusePeriodSeconds(123)
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .tags(List.of(TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html)
 */
public open class CfnActivity(
  cdkObject: software.amazon.awscdk.services.stepfunctions.CfnActivity,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnActivityProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.CfnActivity(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnActivityProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnActivityProps.Builder.() -> Unit,
  ) : this(scope, id, CfnActivityProps(props)
  )

  /**
   * Returns the ARN of the resource.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the name of the activity. For example:.
   *
   * `{ "Fn::GetAtt": ["MyActivity", "Name"] }`
   *
   * Returns a value similar to the following:
   *
   * `myActivity`
   *
   * For more information about using `Fn::GetAtt` , see
   * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
   * .
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * Encryption configuration for the activity.
   */
  public open fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  /**
   * Encryption configuration for the activity.
   */
  public open fun encryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setEncryptionConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Encryption configuration for the activity.
   */
  public open fun encryptionConfiguration(`value`: EncryptionConfigurationProperty) {
    unwrap(this).setEncryptionConfiguration(`value`.let(EncryptionConfigurationProperty.Companion::unwrap))
  }

  /**
   * Encryption configuration for the activity.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3f998e8a15901def1c6db735c2af9991032387c05bdeeef2a8c7d5fd2c6611d3")
  public open
      fun encryptionConfiguration(`value`: EncryptionConfigurationProperty.Builder.() -> Unit): Unit
      = encryptionConfiguration(EncryptionConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the activity.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the activity.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The list of tags to add to a resource.
   */
  public open fun tagsRaw(): List<TagsEntryProperty> =
      unwrap(this).getTagsRaw()?.map(TagsEntryProperty::wrap) ?: emptyList()

  /**
   * The list of tags to add to a resource.
   */
  public open fun tagsRaw(`value`: List<TagsEntryProperty>) {
    unwrap(this).setTagsRaw(`value`.map(TagsEntryProperty.Companion::unwrap))
  }

  /**
   * The list of tags to add to a resource.
   */
  public open fun tagsRaw(vararg `value`: TagsEntryProperty): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.CfnActivity].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Encryption configuration for the activity.
     *
     * Activity configuration is immutable, and resource names must be unique. To set customer
     * managed keys for encryption, you must create a *new Activity* . If you attempt to change the
     * configuration in your CFN template for an existing activity, you will receive an
     * `ActivityAlreadyExists` exception.
     *
     * To update your activity to include customer managed keys, set a new activity name within your
     * AWS CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-encryptionconfiguration)
     * @param encryptionConfiguration Encryption configuration for the activity. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    /**
     * Encryption configuration for the activity.
     *
     * Activity configuration is immutable, and resource names must be unique. To set customer
     * managed keys for encryption, you must create a *new Activity* . If you attempt to change the
     * configuration in your CFN template for an existing activity, you will receive an
     * `ActivityAlreadyExists` exception.
     *
     * To update your activity to include customer managed keys, set a new activity name within your
     * AWS CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-encryptionconfiguration)
     * @param encryptionConfiguration Encryption configuration for the activity. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

    /**
     * Encryption configuration for the activity.
     *
     * Activity configuration is immutable, and resource names must be unique. To set customer
     * managed keys for encryption, you must create a *new Activity* . If you attempt to change the
     * configuration in your CFN template for an existing activity, you will receive an
     * `ActivityAlreadyExists` exception.
     *
     * To update your activity to include customer managed keys, set a new activity name within your
     * AWS CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-encryptionconfiguration)
     * @param encryptionConfiguration Encryption configuration for the activity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("318f6cd8446d92a6cfca26790fe53098c5e5486a6a076c40e5f96ed4c7f80d0a")
    public
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of the activity.
     *
     * A name must *not* contain:
     *
     * * white space
     * * brackets `&lt; &gt; { } [ ]`
     * * wildcard characters `? *`
     * * special characters `" # % \ ^ | ~ ` $ &amp; , ; : /`
     * * control characters ( `U+0000-001F` , `U+007F-009F` , `U+FFFE-FFFF` )
     * * surrogates ( `U+D800-DFFF` )
     * * invalid characters ( `U+10FFFF` )
     *
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-name)
     * @param name The name of the activity. 
     */
    public fun name(name: String)

    /**
     * The list of tags to add to a resource.
     *
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-tags)
     * @param tags The list of tags to add to a resource. 
     */
    public fun tags(tags: List<TagsEntryProperty>)

    /**
     * The list of tags to add to a resource.
     *
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-tags)
     * @param tags The list of tags to add to a resource. 
     */
    public fun tags(vararg tags: TagsEntryProperty)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.CfnActivity.Builder =
        software.amazon.awscdk.services.stepfunctions.CfnActivity.Builder.create(scope, id)

    /**
     * Encryption configuration for the activity.
     *
     * Activity configuration is immutable, and resource names must be unique. To set customer
     * managed keys for encryption, you must create a *new Activity* . If you attempt to change the
     * configuration in your CFN template for an existing activity, you will receive an
     * `ActivityAlreadyExists` exception.
     *
     * To update your activity to include customer managed keys, set a new activity name within your
     * AWS CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-encryptionconfiguration)
     * @param encryptionConfiguration Encryption configuration for the activity. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Encryption configuration for the activity.
     *
     * Activity configuration is immutable, and resource names must be unique. To set customer
     * managed keys for encryption, you must create a *new Activity* . If you attempt to change the
     * configuration in your CFN template for an existing activity, you will receive an
     * `ActivityAlreadyExists` exception.
     *
     * To update your activity to include customer managed keys, set a new activity name within your
     * AWS CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-encryptionconfiguration)
     * @param encryptionConfiguration Encryption configuration for the activity. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * Encryption configuration for the activity.
     *
     * Activity configuration is immutable, and resource names must be unique. To set customer
     * managed keys for encryption, you must create a *new Activity* . If you attempt to change the
     * configuration in your CFN template for an existing activity, you will receive an
     * `ActivityAlreadyExists` exception.
     *
     * To update your activity to include customer managed keys, set a new activity name within your
     * AWS CloudFormation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-encryptionconfiguration)
     * @param encryptionConfiguration Encryption configuration for the activity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("318f6cd8446d92a6cfca26790fe53098c5e5486a6a076c40e5f96ed4c7f80d0a")
    override
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

    /**
     * The name of the activity.
     *
     * A name must *not* contain:
     *
     * * white space
     * * brackets `&lt; &gt; { } [ ]`
     * * wildcard characters `? *`
     * * special characters `" # % \ ^ | ~ ` $ &amp; , ; : /`
     * * control characters ( `U+0000-001F` , `U+007F-009F` , `U+FFFE-FFFF` )
     * * surrogates ( `U+D800-DFFF` )
     * * invalid characters ( `U+10FFFF` )
     *
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-name)
     * @param name The name of the activity. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The list of tags to add to a resource.
     *
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-tags)
     * @param tags The list of tags to add to a resource. 
     */
    override fun tags(tags: List<TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(TagsEntryProperty.Companion::unwrap))
    }

    /**
     * The list of tags to add to a resource.
     *
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-tags)
     * @param tags The list of tags to add to a resource. 
     */
    override fun tags(vararg tags: TagsEntryProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.stepfunctions.CfnActivity =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.stepfunctions.CfnActivity.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnActivity {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnActivity(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnActivity):
        CfnActivity = CfnActivity(cdkObject)

    internal fun unwrap(wrapped: CfnActivity):
        software.amazon.awscdk.services.stepfunctions.CfnActivity = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.CfnActivity
  }

  /**
   * Settings to configure server-side encryption for an activity.
   *
   * By default, Step Functions provides transparent server-side encryption. With this
   * configuration, you can specify a customer managed AWS KMS key for encryption.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
   * EncryptionConfigurationProperty encryptionConfigurationProperty =
   * EncryptionConfigurationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .kmsDataKeyReusePeriodSeconds(123)
   * .kmsKeyId("kmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-activity-encryptionconfiguration.html)
   */
  public interface EncryptionConfigurationProperty {
    /**
     * Maximum duration that Step Functions will reuse data keys.
     *
     * When the period expires, Step Functions will call `GenerateDataKey` . Only applies to
     * customer managed keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-activity-encryptionconfiguration.html#cfn-stepfunctions-activity-encryptionconfiguration-kmsdatakeyreuseperiodseconds)
     */
    public fun kmsDataKeyReusePeriodSeconds(): Number? =
        unwrap(this).getKmsDataKeyReusePeriodSeconds()

    /**
     * An alias, alias ARN, key ID, or key ARN of a symmetric encryption AWS KMS key to encrypt
     * data.
     *
     * To specify a AWS KMS key in a different AWS account, you must use the key ARN or alias ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-activity-encryptionconfiguration.html#cfn-stepfunctions-activity-encryptionconfiguration-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Encryption option for an activity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-activity-encryptionconfiguration.html#cfn-stepfunctions-activity-encryptionconfiguration-type)
     */
    public fun type(): String

    /**
     * A builder for [EncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsDataKeyReusePeriodSeconds Maximum duration that Step Functions will reuse data
       * keys.
       * When the period expires, Step Functions will call `GenerateDataKey` . Only applies to
       * customer managed keys.
       */
      public fun kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds: Number)

      /**
       * @param kmsKeyId An alias, alias ARN, key ID, or key ARN of a symmetric encryption AWS KMS
       * key to encrypt data.
       * To specify a AWS KMS key in a different AWS account, you must use the key ARN or alias ARN.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param type Encryption option for an activity. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.CfnActivity.EncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.CfnActivity.EncryptionConfigurationProperty.builder()

      /**
       * @param kmsDataKeyReusePeriodSeconds Maximum duration that Step Functions will reuse data
       * keys.
       * When the period expires, Step Functions will call `GenerateDataKey` . Only applies to
       * customer managed keys.
       */
      override fun kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds: Number) {
        cdkBuilder.kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds)
      }

      /**
       * @param kmsKeyId An alias, alias ARN, key ID, or key ARN of a symmetric encryption AWS KMS
       * key to encrypt data.
       * To specify a AWS KMS key in a different AWS account, you must use the key ARN or alias ARN.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param type Encryption option for an activity. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnActivity.EncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.stepfunctions.CfnActivity.EncryptionConfigurationProperty,
    ) : CdkObject(cdkObject),
        EncryptionConfigurationProperty {
      /**
       * Maximum duration that Step Functions will reuse data keys.
       *
       * When the period expires, Step Functions will call `GenerateDataKey` . Only applies to
       * customer managed keys.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-activity-encryptionconfiguration.html#cfn-stepfunctions-activity-encryptionconfiguration-kmsdatakeyreuseperiodseconds)
       */
      override fun kmsDataKeyReusePeriodSeconds(): Number? =
          unwrap(this).getKmsDataKeyReusePeriodSeconds()

      /**
       * An alias, alias ARN, key ID, or key ARN of a symmetric encryption AWS KMS key to encrypt
       * data.
       *
       * To specify a AWS KMS key in a different AWS account, you must use the key ARN or alias ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-activity-encryptionconfiguration.html#cfn-stepfunctions-activity-encryptionconfiguration-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * Encryption option for an activity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-activity-encryptionconfiguration.html#cfn-stepfunctions-activity-encryptionconfiguration-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnActivity.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.stepfunctions.CfnActivity.EncryptionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.CfnActivity.EncryptionConfigurationProperty
    }
  }

  /**
   * The `TagsEntry` property specifies *tags* to identify an activity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
   * TagsEntryProperty tagsEntryProperty = TagsEntryProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-activity-tagsentry.html)
   */
  public interface TagsEntryProperty {
    /**
     * The `key` for a key-value pair in a tag entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-activity-tagsentry.html#cfn-stepfunctions-activity-tagsentry-key)
     */
    public fun key(): String

    /**
     * The `value` for a key-value pair in a tag entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-activity-tagsentry.html#cfn-stepfunctions-activity-tagsentry-value)
     */
    public fun `value`(): String

    /**
     * A builder for [TagsEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The `key` for a key-value pair in a tag entry. 
       */
      public fun key(key: String)

      /**
       * @param value The `value` for a key-value pair in a tag entry. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty.Builder =
          software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty.builder()

      /**
       * @param key The `key` for a key-value pair in a tag entry. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The `value` for a key-value pair in a tag entry. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty,
    ) : CdkObject(cdkObject),
        TagsEntryProperty {
      /**
       * The `key` for a key-value pair in a tag entry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-activity-tagsentry.html#cfn-stepfunctions-activity-tagsentry-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The `value` for a key-value pair in a tag entry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-activity-tagsentry.html#cfn-stepfunctions-activity-tagsentry-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagsEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty):
          TagsEntryProperty = CdkObjectWrappers.wrap(cdkObject) as? TagsEntryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagsEntryProperty):
          software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty
    }
  }
}
