@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnGroupVersionProps {
  public fun connectorDefinitionVersionArn(): String? =
      unwrap(this).getConnectorDefinitionVersionArn()

  public fun coreDefinitionVersionArn(): String? = unwrap(this).getCoreDefinitionVersionArn()

  public fun deviceDefinitionVersionArn(): String? = unwrap(this).getDeviceDefinitionVersionArn()

  public fun functionDefinitionVersionArn(): String? =
      unwrap(this).getFunctionDefinitionVersionArn()

  public fun groupId(): String

  public fun loggerDefinitionVersionArn(): String? = unwrap(this).getLoggerDefinitionVersionArn()

  public fun resourceDefinitionVersionArn(): String? =
      unwrap(this).getResourceDefinitionVersionArn()

  public fun subscriptionDefinitionVersionArn(): String? =
      unwrap(this).getSubscriptionDefinitionVersionArn()

  @CdkDslMarker
  public interface Builder {
    public fun connectorDefinitionVersionArn(connectorDefinitionVersionArn: String)

    public fun coreDefinitionVersionArn(coreDefinitionVersionArn: String)

    public fun deviceDefinitionVersionArn(deviceDefinitionVersionArn: String)

    public fun functionDefinitionVersionArn(functionDefinitionVersionArn: String)

    public fun groupId(groupId: String)

    public fun loggerDefinitionVersionArn(loggerDefinitionVersionArn: String)

    public fun resourceDefinitionVersionArn(resourceDefinitionVersionArn: String)

    public fun subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrass.CfnGroupVersionProps.Builder
        = software.amazon.awscdk.services.greengrass.CfnGroupVersionProps.builder()

    override fun connectorDefinitionVersionArn(connectorDefinitionVersionArn: String) {
      cdkBuilder.connectorDefinitionVersionArn(connectorDefinitionVersionArn)
    }

    override fun coreDefinitionVersionArn(coreDefinitionVersionArn: String) {
      cdkBuilder.coreDefinitionVersionArn(coreDefinitionVersionArn)
    }

    override fun deviceDefinitionVersionArn(deviceDefinitionVersionArn: String) {
      cdkBuilder.deviceDefinitionVersionArn(deviceDefinitionVersionArn)
    }

    override fun functionDefinitionVersionArn(functionDefinitionVersionArn: String) {
      cdkBuilder.functionDefinitionVersionArn(functionDefinitionVersionArn)
    }

    override fun groupId(groupId: String) {
      cdkBuilder.groupId(groupId)
    }

    override fun loggerDefinitionVersionArn(loggerDefinitionVersionArn: String) {
      cdkBuilder.loggerDefinitionVersionArn(loggerDefinitionVersionArn)
    }

    override fun resourceDefinitionVersionArn(resourceDefinitionVersionArn: String) {
      cdkBuilder.resourceDefinitionVersionArn(resourceDefinitionVersionArn)
    }

    override fun subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn: String) {
      cdkBuilder.subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnGroupVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.greengrass.CfnGroupVersionProps,
  ) : CdkObject(cdkObject), CfnGroupVersionProps {
    override fun connectorDefinitionVersionArn(): String? =
        unwrap(this).getConnectorDefinitionVersionArn()

    override fun coreDefinitionVersionArn(): String? = unwrap(this).getCoreDefinitionVersionArn()

    override fun deviceDefinitionVersionArn(): String? =
        unwrap(this).getDeviceDefinitionVersionArn()

    override fun functionDefinitionVersionArn(): String? =
        unwrap(this).getFunctionDefinitionVersionArn()

    override fun groupId(): String = unwrap(this).getGroupId()

    override fun loggerDefinitionVersionArn(): String? =
        unwrap(this).getLoggerDefinitionVersionArn()

    override fun resourceDefinitionVersionArn(): String? =
        unwrap(this).getResourceDefinitionVersionArn()

    override fun subscriptionDefinitionVersionArn(): String? =
        unwrap(this).getSubscriptionDefinitionVersionArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGroupVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnGroupVersionProps):
        CfnGroupVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGroupVersionProps):
        software.amazon.awscdk.services.greengrass.CfnGroupVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.greengrass.CfnGroupVersionProps
  }
}
