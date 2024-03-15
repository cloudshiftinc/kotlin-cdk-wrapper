@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sso

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnInstanceAccessControlAttributeConfigurationProps {
  public fun accessControlAttributes(): Any? = unwrap(this).getAccessControlAttributes()

  @Deprecated(message = "deprecated in CDK")
  public fun instanceAccessControlAttributeConfiguration(): Any? =
      unwrap(this).getInstanceAccessControlAttributeConfiguration()

  public fun instanceArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun accessControlAttributes(accessControlAttributes: IResolvable)

    public fun accessControlAttributes(accessControlAttributes: List<Any>)

    public fun accessControlAttributes(vararg accessControlAttributes: Any)

    @Deprecated(message = "deprecated in CDK")
    public
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: IResolvable)

    @Deprecated(message = "deprecated in CDK")
    public
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26821bacab8a24fcf448becbae63ae46dc176cd39e008b5015bd242b7b7b661b")
    public
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty.Builder.() -> Unit)

    public fun instanceArn(instanceArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps.Builder
        =
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps.builder()

    override fun accessControlAttributes(accessControlAttributes: IResolvable) {
      cdkBuilder.accessControlAttributes(accessControlAttributes.let(IResolvable::unwrap))
    }

    override fun accessControlAttributes(accessControlAttributes: List<Any>) {
      cdkBuilder.accessControlAttributes(accessControlAttributes)
    }

    override fun accessControlAttributes(vararg accessControlAttributes: Any): Unit =
        accessControlAttributes(accessControlAttributes.toList())

    @Deprecated(message = "deprecated in CDK")
    override
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: IResolvable) {
      cdkBuilder.instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration.let(IResolvable::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty) {
      cdkBuilder.instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration.let(CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26821bacab8a24fcf448becbae63ae46dc176cd39e008b5015bd242b7b7b661b")
    override
        fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty.Builder.() -> Unit):
        Unit =
        instanceAccessControlAttributeConfiguration(CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty(instanceAccessControlAttributeConfiguration))

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    public fun build():
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps,
  ) : CdkObject(cdkObject), CfnInstanceAccessControlAttributeConfigurationProps {
    override fun accessControlAttributes(): Any? = unwrap(this).getAccessControlAttributes()

    @Deprecated(message = "deprecated in CDK")
    override fun instanceAccessControlAttributeConfiguration(): Any? =
        unwrap(this).getInstanceAccessControlAttributeConfiguration()

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
        CfnInstanceAccessControlAttributeConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceAccessControlAttributeConfigurationProps):
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps
  }
}
