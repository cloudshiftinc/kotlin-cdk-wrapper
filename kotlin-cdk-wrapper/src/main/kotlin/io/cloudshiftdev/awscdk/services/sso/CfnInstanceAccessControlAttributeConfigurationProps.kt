@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sso

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnInstanceAccessControlAttributeConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sso.*;
 * CfnInstanceAccessControlAttributeConfigurationProps
 * cfnInstanceAccessControlAttributeConfigurationProps =
 * CfnInstanceAccessControlAttributeConfigurationProps.builder()
 * .instanceArn("instanceArn")
 * // the properties below are optional
 * .accessControlAttributes(List.of(AccessControlAttributeProperty.builder()
 * .key("key")
 * .value(AccessControlAttributeValueProperty.builder()
 * .source(List.of("source"))
 * .build())
 * .build()))
 * .instanceAccessControlAttributeConfiguration(InstanceAccessControlAttributeConfigurationProperty.builder()
 * .accessControlAttributes(List.of(AccessControlAttributeProperty.builder()
 * .key("key")
 * .value(AccessControlAttributeValueProperty.builder()
 * .source(List.of("source"))
 * .build())
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html)
 */
public interface CfnInstanceAccessControlAttributeConfigurationProps {
  /**
   * Lists the attributes that are configured for ABAC in the specified IAM Identity Center
   * instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributes)
   */
  public fun accessControlAttributes(): Any? = unwrap(this).getAccessControlAttributes()

  /**
   * (deprecated) The InstanceAccessControlAttributeConfiguration property has been deprecated but
   * is still supported for backwards compatibility purposes.
   *
   * We recomend that you use  AccessControlAttributes property instead.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun instanceAccessControlAttributeConfiguration(): Any? =
      unwrap(this).getInstanceAccessControlAttributeConfiguration()

  /**
   * The ARN of the IAM Identity Center instance under which the operation will be executed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instancearn)
   */
  public fun instanceArn(): String

  /**
   * A builder for [CfnInstanceAccessControlAttributeConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
     * specified IAM Identity Center instance.
     */
    public fun accessControlAttributes(accessControlAttributes: IResolvable)

    /**
     * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
     * specified IAM Identity Center instance.
     */
    public fun accessControlAttributes(accessControlAttributes: List<Any>)

    /**
     * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
     * specified IAM Identity Center instance.
     */
    public fun accessControlAttributes(vararg accessControlAttributes: Any)

    /**
     * @param instanceAccessControlAttributeConfiguration The
     * InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported
     * for backwards compatibility purposes.
     * We recomend that you use  AccessControlAttributes property instead.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: IResolvable)

    /**
     * @param instanceAccessControlAttributeConfiguration The
     * InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported
     * for backwards compatibility purposes.
     * We recomend that you use  AccessControlAttributes property instead.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty)

    /**
     * @param instanceAccessControlAttributeConfiguration The
     * InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported
     * for backwards compatibility purposes.
     * We recomend that you use  AccessControlAttributes property instead.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26821bacab8a24fcf448becbae63ae46dc176cd39e008b5015bd242b7b7b661b")
    public
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty.Builder.() -> Unit)

    /**
     * @param instanceArn The ARN of the IAM Identity Center instance under which the operation will
     * be executed. 
     */
    public fun instanceArn(instanceArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps.Builder
        =
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps.builder()

    /**
     * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
     * specified IAM Identity Center instance.
     */
    override fun accessControlAttributes(accessControlAttributes: IResolvable) {
      cdkBuilder.accessControlAttributes(accessControlAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
     * specified IAM Identity Center instance.
     */
    override fun accessControlAttributes(accessControlAttributes: List<Any>) {
      cdkBuilder.accessControlAttributes(accessControlAttributes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
     * specified IAM Identity Center instance.
     */
    override fun accessControlAttributes(vararg accessControlAttributes: Any): Unit =
        accessControlAttributes(accessControlAttributes.toList())

    /**
     * @param instanceAccessControlAttributeConfiguration The
     * InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported
     * for backwards compatibility purposes.
     * We recomend that you use  AccessControlAttributes property instead.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: IResolvable) {
      cdkBuilder.instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param instanceAccessControlAttributeConfiguration The
     * InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported
     * for backwards compatibility purposes.
     * We recomend that you use  AccessControlAttributes property instead.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty) {
      cdkBuilder.instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration.let(CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param instanceAccessControlAttributeConfiguration The
     * InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported
     * for backwards compatibility purposes.
     * We recomend that you use  AccessControlAttributes property instead.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26821bacab8a24fcf448becbae63ae46dc176cd39e008b5015bd242b7b7b661b")
    override
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty.Builder.() -> Unit):
        Unit =
        instanceAccessControlAttributeConfiguration(CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty(instanceAccessControlAttributeConfiguration))

    /**
     * @param instanceArn The ARN of the IAM Identity Center instance under which the operation will
     * be executed. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    public fun build():
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps,
  ) : CdkObject(cdkObject), CfnInstanceAccessControlAttributeConfigurationProps {
    /**
     * Lists the attributes that are configured for ABAC in the specified IAM Identity Center
     * instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributes)
     */
    override fun accessControlAttributes(): Any? = unwrap(this).getAccessControlAttributes()

    /**
     * (deprecated) The InstanceAccessControlAttributeConfiguration property has been deprecated but
     * is still supported for backwards compatibility purposes.
     *
     * We recomend that you use  AccessControlAttributes property instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun instanceAccessControlAttributeConfiguration(): Any? =
        unwrap(this).getInstanceAccessControlAttributeConfiguration()

    /**
     * The ARN of the IAM Identity Center instance under which the operation will be executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnInstanceAccessControlAttributeConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps):
        CfnInstanceAccessControlAttributeConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnInstanceAccessControlAttributeConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceAccessControlAttributeConfigurationProps):
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps
  }
}
