@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGroupVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.greengrass.CfnGroupVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun connectorDefinitionVersionArn(): String? =
      unwrap(this).getConnectorDefinitionVersionArn()

  public open fun connectorDefinitionVersionArn(`value`: String) {
    unwrap(this).setConnectorDefinitionVersionArn(`value`)
  }

  public open fun coreDefinitionVersionArn(): String? = unwrap(this).getCoreDefinitionVersionArn()

  public open fun coreDefinitionVersionArn(`value`: String) {
    unwrap(this).setCoreDefinitionVersionArn(`value`)
  }

  public open fun deviceDefinitionVersionArn(): String? =
      unwrap(this).getDeviceDefinitionVersionArn()

  public open fun deviceDefinitionVersionArn(`value`: String) {
    unwrap(this).setDeviceDefinitionVersionArn(`value`)
  }

  public open fun functionDefinitionVersionArn(): String? =
      unwrap(this).getFunctionDefinitionVersionArn()

  public open fun functionDefinitionVersionArn(`value`: String) {
    unwrap(this).setFunctionDefinitionVersionArn(`value`)
  }

  public open fun groupId(): String = unwrap(this).getGroupId()

  public open fun groupId(`value`: String) {
    unwrap(this).setGroupId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loggerDefinitionVersionArn(): String? =
      unwrap(this).getLoggerDefinitionVersionArn()

  public open fun loggerDefinitionVersionArn(`value`: String) {
    unwrap(this).setLoggerDefinitionVersionArn(`value`)
  }

  public open fun resourceDefinitionVersionArn(): String? =
      unwrap(this).getResourceDefinitionVersionArn()

  public open fun resourceDefinitionVersionArn(`value`: String) {
    unwrap(this).setResourceDefinitionVersionArn(`value`)
  }

  public open fun subscriptionDefinitionVersionArn(): String? =
      unwrap(this).getSubscriptionDefinitionVersionArn()

  public open fun subscriptionDefinitionVersionArn(`value`: String) {
    unwrap(this).setSubscriptionDefinitionVersionArn(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrass.CfnGroupVersion.Builder =
        software.amazon.awscdk.services.greengrass.CfnGroupVersion.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.greengrass.CfnGroupVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnGroupVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGroupVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGroupVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnGroupVersion):
        CfnGroupVersion = CfnGroupVersion(cdkObject)

    internal fun unwrap(wrapped: CfnGroupVersion):
        software.amazon.awscdk.services.greengrass.CfnGroupVersion = wrapped.cdkObject
  }
}
