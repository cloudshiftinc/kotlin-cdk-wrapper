@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnActivity`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * CfnActivityProps cfnActivityProps = CfnActivityProps.builder()
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
public interface CfnActivityProps {
  /**
   * Encryption configuration for the activity.
   *
   * Activity configuration is immutable, and resource names must be unique. To set customer managed
   * keys for encryption, you must create a *new Activity* . If you attempt to change the configuration
   * in your CFN template for an existing activity, you will receive an `ActivityAlreadyExists`
   * exception.
   *
   * To update your activity to include customer managed keys, set a new activity name within your
   * AWS CloudFormation template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-encryptionconfiguration)
   */
  public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  /**
   * The name of the activity.
   *
   * A name must *not* contain:
   *
   * * white space
   * * brackets `&lt; &gt; { } [ ]`
   * * wildcard characters `? *`
   * * special characters `" # % \ ^ | ~ ` $ &amp; , ; : /`
   * * control characters ( `U+0000-001F` , `U+007F-009F` )
   *
   * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-name)
   */
  public fun name(): String

  /**
   * The list of tags to add to a resource.
   *
   * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-tags)
   */
  public fun tags(): List<CfnActivity.TagsEntryProperty> =
      unwrap(this).getTags()?.map(CfnActivity.TagsEntryProperty::wrap) ?: emptyList()

  /**
   * A builder for [CfnActivityProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param encryptionConfiguration Encryption configuration for the activity.
     * Activity configuration is immutable, and resource names must be unique. To set customer
     * managed keys for encryption, you must create a *new Activity* . If you attempt to change the
     * configuration in your CFN template for an existing activity, you will receive an
     * `ActivityAlreadyExists` exception.
     *
     * To update your activity to include customer managed keys, set a new activity name within your
     * AWS CloudFormation template.
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    /**
     * @param encryptionConfiguration Encryption configuration for the activity.
     * Activity configuration is immutable, and resource names must be unique. To set customer
     * managed keys for encryption, you must create a *new Activity* . If you attempt to change the
     * configuration in your CFN template for an existing activity, you will receive an
     * `ActivityAlreadyExists` exception.
     *
     * To update your activity to include customer managed keys, set a new activity name within your
     * AWS CloudFormation template.
     */
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnActivity.EncryptionConfigurationProperty)

    /**
     * @param encryptionConfiguration Encryption configuration for the activity.
     * Activity configuration is immutable, and resource names must be unique. To set customer
     * managed keys for encryption, you must create a *new Activity* . If you attempt to change the
     * configuration in your CFN template for an existing activity, you will receive an
     * `ActivityAlreadyExists` exception.
     *
     * To update your activity to include customer managed keys, set a new activity name within your
     * AWS CloudFormation template.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8826c7c1815e0b788e8cd3d0621a57990770b6045bed9f60b1513d4f9659bd1")
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnActivity.EncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param name The name of the activity. 
     * A name must *not* contain:
     *
     * * white space
     * * brackets `&lt; &gt; { } [ ]`
     * * wildcard characters `? *`
     * * special characters `" # % \ ^ | ~ ` $ &amp; , ; : /`
     * * control characters ( `U+0000-001F` , `U+007F-009F` )
     *
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     */
    public fun name(name: String)

    /**
     * @param tags The list of tags to add to a resource.
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     */
    public fun tags(tags: List<CfnActivity.TagsEntryProperty>)

    /**
     * @param tags The list of tags to add to a resource.
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     */
    public fun tags(vararg tags: CfnActivity.TagsEntryProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.CfnActivityProps.Builder =
        software.amazon.awscdk.services.stepfunctions.CfnActivityProps.builder()

    /**
     * @param encryptionConfiguration Encryption configuration for the activity.
     * Activity configuration is immutable, and resource names must be unique. To set customer
     * managed keys for encryption, you must create a *new Activity* . If you attempt to change the
     * configuration in your CFN template for an existing activity, you will receive an
     * `ActivityAlreadyExists` exception.
     *
     * To update your activity to include customer managed keys, set a new activity name within your
     * AWS CloudFormation template.
     */
    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param encryptionConfiguration Encryption configuration for the activity.
     * Activity configuration is immutable, and resource names must be unique. To set customer
     * managed keys for encryption, you must create a *new Activity* . If you attempt to change the
     * configuration in your CFN template for an existing activity, you will receive an
     * `ActivityAlreadyExists` exception.
     *
     * To update your activity to include customer managed keys, set a new activity name within your
     * AWS CloudFormation template.
     */
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnActivity.EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(CfnActivity.EncryptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param encryptionConfiguration Encryption configuration for the activity.
     * Activity configuration is immutable, and resource names must be unique. To set customer
     * managed keys for encryption, you must create a *new Activity* . If you attempt to change the
     * configuration in your CFN template for an existing activity, you will receive an
     * `ActivityAlreadyExists` exception.
     *
     * To update your activity to include customer managed keys, set a new activity name within your
     * AWS CloudFormation template.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8826c7c1815e0b788e8cd3d0621a57990770b6045bed9f60b1513d4f9659bd1")
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnActivity.EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        encryptionConfiguration(CfnActivity.EncryptionConfigurationProperty(encryptionConfiguration))

    /**
     * @param name The name of the activity. 
     * A name must *not* contain:
     *
     * * white space
     * * brackets `&lt; &gt; { } [ ]`
     * * wildcard characters `? *`
     * * special characters `" # % \ ^ | ~ ` $ &amp; , ; : /`
     * * control characters ( `U+0000-001F` , `U+007F-009F` )
     *
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The list of tags to add to a resource.
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     */
    override fun tags(tags: List<CfnActivity.TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(CfnActivity.TagsEntryProperty.Companion::unwrap))
    }

    /**
     * @param tags The list of tags to add to a resource.
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     */
    override fun tags(vararg tags: CfnActivity.TagsEntryProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.stepfunctions.CfnActivityProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.CfnActivityProps,
  ) : CdkObject(cdkObject),
      CfnActivityProps {
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
     */
    override fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    /**
     * The name of the activity.
     *
     * A name must *not* contain:
     *
     * * white space
     * * brackets `&lt; &gt; { } [ ]`
     * * wildcard characters `? *`
     * * special characters `" # % \ ^ | ~ ` $ &amp; , ; : /`
     * * control characters ( `U+0000-001F` , `U+007F-009F` )
     *
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The list of tags to add to a resource.
     *
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-tags)
     */
    override fun tags(): List<CfnActivity.TagsEntryProperty> =
        unwrap(this).getTags()?.map(CfnActivity.TagsEntryProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnActivityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnActivityProps):
        CfnActivityProps = CdkObjectWrappers.wrap(cdkObject) as? CfnActivityProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnActivityProps):
        software.amazon.awscdk.services.stepfunctions.CfnActivityProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.CfnActivityProps
  }
}
