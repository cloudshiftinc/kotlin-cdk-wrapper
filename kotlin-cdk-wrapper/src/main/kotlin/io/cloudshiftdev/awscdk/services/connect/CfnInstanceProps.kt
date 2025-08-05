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
 * Properties for defining a `CfnInstance`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnInstanceProps cfnInstanceProps = CfnInstanceProps.builder()
 * .attributes(AttributesProperty.builder()
 * .inboundCalls(false)
 * .outboundCalls(false)
 * // the properties below are optional
 * .autoResolveBestVoices(false)
 * .contactflowLogs(false)
 * .contactLens(false)
 * .earlyMedia(false)
 * .enhancedChatMonitoring(false)
 * .enhancedContactMonitoring(false)
 * .highVolumeOutBound(false)
 * .multiPartyChatConference(false)
 * .multiPartyConference(false)
 * .useCustomTtsVoices(false)
 * .build())
 * .identityManagementType("identityManagementType")
 * // the properties below are optional
 * .directoryId("directoryId")
 * .instanceAlias("instanceAlias")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html)
 */
public interface CfnInstanceProps {
  /**
   * A toggle for an individual feature at the instance level.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-attributes)
   */
  public fun attributes(): Any

  /**
   * The identifier for the directory.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-directoryid)
   */
  public fun directoryId(): String? = unwrap(this).getDirectoryId()

  /**
   * The identity management type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-identitymanagementtype)
   */
  public fun identityManagementType(): String

  /**
   * The alias of instance.
   *
   * `InstanceAlias` is only required when `IdentityManagementType` is `CONNECT_MANAGED` or `SAML` .
   * `InstanceAlias` is not required when `IdentityManagementType` is `EXISTING_DIRECTORY` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-instancealias)
   */
  public fun instanceAlias(): String? = unwrap(this).getInstanceAlias()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attributes A toggle for an individual feature at the instance level. 
     */
    public fun attributes(attributes: IResolvable)

    /**
     * @param attributes A toggle for an individual feature at the instance level. 
     */
    public fun attributes(attributes: CfnInstance.AttributesProperty)

    /**
     * @param attributes A toggle for an individual feature at the instance level. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57f9064a81551068452a07f3eda544db73055a080aa9892a96a766b6bda86e54")
    public fun attributes(attributes: CfnInstance.AttributesProperty.Builder.() -> Unit)

    /**
     * @param directoryId The identifier for the directory.
     */
    public fun directoryId(directoryId: String)

    /**
     * @param identityManagementType The identity management type. 
     */
    public fun identityManagementType(identityManagementType: String)

    /**
     * @param instanceAlias The alias of instance.
     * `InstanceAlias` is only required when `IdentityManagementType` is `CONNECT_MANAGED` or `SAML`
     * . `InstanceAlias` is not required when `IdentityManagementType` is `EXISTING_DIRECTORY` .
     */
    public fun instanceAlias(instanceAlias: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnInstanceProps.Builder =
        software.amazon.awscdk.services.connect.CfnInstanceProps.builder()

    /**
     * @param attributes A toggle for an individual feature at the instance level. 
     */
    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param attributes A toggle for an individual feature at the instance level. 
     */
    override fun attributes(attributes: CfnInstance.AttributesProperty) {
      cdkBuilder.attributes(attributes.let(CfnInstance.AttributesProperty.Companion::unwrap))
    }

    /**
     * @param attributes A toggle for an individual feature at the instance level. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57f9064a81551068452a07f3eda544db73055a080aa9892a96a766b6bda86e54")
    override fun attributes(attributes: CfnInstance.AttributesProperty.Builder.() -> Unit): Unit =
        attributes(CfnInstance.AttributesProperty(attributes))

    /**
     * @param directoryId The identifier for the directory.
     */
    override fun directoryId(directoryId: String) {
      cdkBuilder.directoryId(directoryId)
    }

    /**
     * @param identityManagementType The identity management type. 
     */
    override fun identityManagementType(identityManagementType: String) {
      cdkBuilder.identityManagementType(identityManagementType)
    }

    /**
     * @param instanceAlias The alias of instance.
     * `InstanceAlias` is only required when `IdentityManagementType` is `CONNECT_MANAGED` or `SAML`
     * . `InstanceAlias` is not required when `IdentityManagementType` is `EXISTING_DIRECTORY` .
     */
    override fun instanceAlias(instanceAlias: String) {
      cdkBuilder.instanceAlias(instanceAlias)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.connect.CfnInstanceProps,
  ) : CdkObject(cdkObject),
      CfnInstanceProps {
    /**
     * A toggle for an individual feature at the instance level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-attributes)
     */
    override fun attributes(): Any = unwrap(this).getAttributes()

    /**
     * The identifier for the directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-directoryid)
     */
    override fun directoryId(): String? = unwrap(this).getDirectoryId()

    /**
     * The identity management type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-identitymanagementtype)
     */
    override fun identityManagementType(): String = unwrap(this).getIdentityManagementType()

    /**
     * The alias of instance.
     *
     * `InstanceAlias` is only required when `IdentityManagementType` is `CONNECT_MANAGED` or `SAML`
     * . `InstanceAlias` is not required when `IdentityManagementType` is `EXISTING_DIRECTORY` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-instancealias)
     */
    override fun instanceAlias(): String? = unwrap(this).getInstanceAlias()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstanceProps):
        CfnInstanceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnInstanceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProps):
        software.amazon.awscdk.services.connect.CfnInstanceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.connect.CfnInstanceProps
  }
}
