@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

import io.cloudshiftdev.awscdk.CfnTag
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
 * Properties for defining a `CfnAssistant`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnAssistantProps cfnAssistantProps = CfnAssistantProps.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html)
 */
public interface CfnAssistantProps {
  /**
   * The description of the assistant.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the assistant.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-name)
   */
  public fun name(): String

  /**
   * The configuration information for the customer managed key used for encryption.
   *
   * The customer managed key must have a policy that allows `kms:CreateGrant` and `kms:DescribeKey`
   * permissions to the IAM identity using the key to invoke Wisdom. To use Wisdom with chat, the key
   * policy must also allow `kms:Decrypt` , `kms:GenerateDataKey*` , and `kms:DescribeKey` permissions
   * to the `connect.amazonaws.com` service principal. For more information about setting up a customer
   * managed key for Wisdom, see [Enable Amazon Connect Wisdom for your
   * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-serversideencryptionconfiguration)
   */
  public fun serverSideEncryptionConfiguration(): Any? =
      unwrap(this).getServerSideEncryptionConfiguration()

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of assistant.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnAssistantProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the assistant.
     */
    public fun description(description: String)

    /**
     * @param name The name of the assistant. 
     */
    public fun name(name: String)

    /**
     * @param serverSideEncryptionConfiguration The configuration information for the customer
     * managed key used for encryption.
     * The customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom. To use Wisdom
     * with chat, the key policy must also allow `kms:Decrypt` , `kms:GenerateDataKey*` , and
     * `kms:DescribeKey` permissions to the `connect.amazonaws.com` service principal. For more
     * information about setting up a customer managed key for Wisdom, see [Enable Amazon Connect
     * Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) .
     */
    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable)

    /**
     * @param serverSideEncryptionConfiguration The configuration information for the customer
     * managed key used for encryption.
     * The customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom. To use Wisdom
     * with chat, the key policy must also allow `kms:Decrypt` , `kms:GenerateDataKey*` , and
     * `kms:DescribeKey` permissions to the `connect.amazonaws.com` service principal. For more
     * information about setting up a customer managed key for Wisdom, see [Enable Amazon Connect
     * Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) .
     */
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnAssistant.ServerSideEncryptionConfigurationProperty)

    /**
     * @param serverSideEncryptionConfiguration The configuration information for the customer
     * managed key used for encryption.
     * The customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom. To use Wisdom
     * with chat, the key policy must also allow `kms:Decrypt` , `kms:GenerateDataKey*` , and
     * `kms:DescribeKey` permissions to the `connect.amazonaws.com` service principal. For more
     * information about setting up a customer managed key for Wisdom, see [Enable Amazon Connect
     * Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab6a626783f9963cbb31657dccf765785c4f07d40c1c028c9b1fe913d4d976d7")
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnAssistant.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of assistant. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnAssistantProps.Builder =
        software.amazon.awscdk.services.wisdom.CfnAssistantProps.builder()

    /**
     * @param description The description of the assistant.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the assistant. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param serverSideEncryptionConfiguration The configuration information for the customer
     * managed key used for encryption.
     * The customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom. To use Wisdom
     * with chat, the key policy must also allow `kms:Decrypt` , `kms:GenerateDataKey*` , and
     * `kms:DescribeKey` permissions to the `connect.amazonaws.com` service principal. For more
     * information about setting up a customer managed key for Wisdom, see [Enable Amazon Connect
     * Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) .
     */
    override fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param serverSideEncryptionConfiguration The configuration information for the customer
     * managed key used for encryption.
     * The customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom. To use Wisdom
     * with chat, the key policy must also allow `kms:Decrypt` , `kms:GenerateDataKey*` , and
     * `kms:DescribeKey` permissions to the `connect.amazonaws.com` service principal. For more
     * information about setting up a customer managed key for Wisdom, see [Enable Amazon Connect
     * Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) .
     */
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnAssistant.ServerSideEncryptionConfigurationProperty) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(CfnAssistant.ServerSideEncryptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param serverSideEncryptionConfiguration The configuration information for the customer
     * managed key used for encryption.
     * The customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom. To use Wisdom
     * with chat, the key policy must also allow `kms:Decrypt` , `kms:GenerateDataKey*` , and
     * `kms:DescribeKey` permissions to the `connect.amazonaws.com` service principal. For more
     * information about setting up a customer managed key for Wisdom, see [Enable Amazon Connect
     * Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab6a626783f9963cbb31657dccf765785c4f07d40c1c028c9b1fe913d4d976d7")
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnAssistant.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverSideEncryptionConfiguration(CfnAssistant.ServerSideEncryptionConfigurationProperty(serverSideEncryptionConfiguration))

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of assistant. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.wisdom.CfnAssistantProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.wisdom.CfnAssistantProps,
  ) : CdkObject(cdkObject), CfnAssistantProps {
    /**
     * The description of the assistant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the assistant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The configuration information for the customer managed key used for encryption.
     *
     * The customer managed key must have a policy that allows `kms:CreateGrant` and
     * `kms:DescribeKey` permissions to the IAM identity using the key to invoke Wisdom. To use Wisdom
     * with chat, the key policy must also allow `kms:Decrypt` , `kms:GenerateDataKey*` , and
     * `kms:DescribeKey` permissions to the `connect.amazonaws.com` service principal. For more
     * information about setting up a customer managed key for Wisdom, see [Enable Amazon Connect
     * Wisdom for your
     * instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-serversideencryptionconfiguration)
     */
    override fun serverSideEncryptionConfiguration(): Any? =
        unwrap(this).getServerSideEncryptionConfiguration()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of assistant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html#cfn-wisdom-assistant-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssistantProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAssistantProps):
        CfnAssistantProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAssistantProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAssistantProps):
        software.amazon.awscdk.services.wisdom.CfnAssistantProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.wisdom.CfnAssistantProps
  }
}
