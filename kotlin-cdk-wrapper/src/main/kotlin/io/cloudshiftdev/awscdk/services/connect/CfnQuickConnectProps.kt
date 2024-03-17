@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

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
 * Properties for defining a `CfnQuickConnect`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnQuickConnectProps cfnQuickConnectProps = CfnQuickConnectProps.builder()
 * .instanceArn("instanceArn")
 * .name("name")
 * .quickConnectConfig(QuickConnectConfigProperty.builder()
 * .quickConnectType("quickConnectType")
 * // the properties below are optional
 * .phoneConfig(PhoneNumberQuickConnectConfigProperty.builder()
 * .phoneNumber("phoneNumber")
 * .build())
 * .queueConfig(QueueQuickConnectConfigProperty.builder()
 * .contactFlowArn("contactFlowArn")
 * .queueArn("queueArn")
 * .build())
 * .userConfig(UserQuickConnectConfigProperty.builder()
 * .contactFlowArn("contactFlowArn")
 * .userArn("userArn")
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html)
 */
public interface CfnQuickConnectProps {
  /**
   * The description of the quick connect.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-instancearn)
   */
  public fun instanceArn(): String

  /**
   * The name of the quick connect.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-name)
   */
  public fun name(): String

  /**
   * Contains information about the quick connect.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-quickconnectconfig)
   */
  public fun quickConnectConfig(): Any

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnQuickConnectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the quick connect.
     */
    public fun description(description: String)

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param name The name of the quick connect. 
     */
    public fun name(name: String)

    /**
     * @param quickConnectConfig Contains information about the quick connect. 
     */
    public fun quickConnectConfig(quickConnectConfig: IResolvable)

    /**
     * @param quickConnectConfig Contains information about the quick connect. 
     */
    public fun quickConnectConfig(quickConnectConfig: CfnQuickConnect.QuickConnectConfigProperty)

    /**
     * @param quickConnectConfig Contains information about the quick connect. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0244a371830d2bd8f6d68fd50cc5b98de8ba73b16b3cf604de906c4e52087d91")
    public
        fun quickConnectConfig(quickConnectConfig: CfnQuickConnect.QuickConnectConfigProperty.Builder.() -> Unit)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnQuickConnectProps.Builder =
        software.amazon.awscdk.services.connect.CfnQuickConnectProps.builder()

    /**
     * @param description The description of the quick connect.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param name The name of the quick connect. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param quickConnectConfig Contains information about the quick connect. 
     */
    override fun quickConnectConfig(quickConnectConfig: IResolvable) {
      cdkBuilder.quickConnectConfig(quickConnectConfig.let(IResolvable::unwrap))
    }

    /**
     * @param quickConnectConfig Contains information about the quick connect. 
     */
    override
        fun quickConnectConfig(quickConnectConfig: CfnQuickConnect.QuickConnectConfigProperty) {
      cdkBuilder.quickConnectConfig(quickConnectConfig.let(CfnQuickConnect.QuickConnectConfigProperty::unwrap))
    }

    /**
     * @param quickConnectConfig Contains information about the quick connect. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0244a371830d2bd8f6d68fd50cc5b98de8ba73b16b3cf604de906c4e52087d91")
    override
        fun quickConnectConfig(quickConnectConfig: CfnQuickConnect.QuickConnectConfigProperty.Builder.() -> Unit):
        Unit = quickConnectConfig(CfnQuickConnect.QuickConnectConfigProperty(quickConnectConfig))

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnQuickConnectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnQuickConnectProps,
  ) : CdkObject(cdkObject), CfnQuickConnectProps {
    /**
     * The description of the quick connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * The name of the quick connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Contains information about the quick connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-quickconnectconfig)
     */
    override fun quickConnectConfig(): Any = unwrap(this).getQuickConnectConfig()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQuickConnectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnQuickConnectProps):
        CfnQuickConnectProps = CdkObjectWrappers.wrap(cdkObject) as? CfnQuickConnectProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQuickConnectProps):
        software.amazon.awscdk.services.connect.CfnQuickConnectProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnQuickConnectProps
  }
}
