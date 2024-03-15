@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.greengrass.CfnGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLatestVersionArn(): String = unwrap(this).getAttrLatestVersionArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun attrRoleArn(): String = unwrap(this).getAttrRoleArn()

  public open fun attrRoleAttachedAt(): String = unwrap(this).getAttrRoleAttachedAt()

  public open fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  public open fun initialVersion(`value`: IResolvable) {
    unwrap(this).setInitialVersion(`value`.let(IResolvable::unwrap))
  }

  public open fun initialVersion(`value`: GroupVersionProperty) {
    unwrap(this).setInitialVersion(`value`.let(GroupVersionProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cf3623d32b961b954570d28feb9ce7cea2345601c196dd92ae445713d6e75b0e")
  public open fun initialVersion(`value`: GroupVersionProperty.Builder.() -> Unit): Unit =
      initialVersion(GroupVersionProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun initialVersion(initialVersion: IResolvable)

    public fun initialVersion(initialVersion: GroupVersionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1a22b88e72663b90cea6aa2128dac78794d50e3d0b1a80477de81af9140da84")
    public fun initialVersion(initialVersion: GroupVersionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrass.CfnGroup.Builder =
        software.amazon.awscdk.services.greengrass.CfnGroup.Builder.create(scope, id)

    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    override fun initialVersion(initialVersion: GroupVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(GroupVersionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1a22b88e72663b90cea6aa2128dac78794d50e3d0b1a80477de81af9140da84")
    override fun initialVersion(initialVersion: GroupVersionProperty.Builder.() -> Unit): Unit =
        initialVersion(GroupVersionProperty(initialVersion))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnGroup): CfnGroup =
        CfnGroup(cdkObject)

    internal fun unwrap(wrapped: CfnGroup): software.amazon.awscdk.services.greengrass.CfnGroup =
        wrapped.cdkObject
  }

  public interface GroupVersionProperty {
    public fun connectorDefinitionVersionArn(): String? =
        unwrap(this).getConnectorDefinitionVersionArn()

    public fun coreDefinitionVersionArn(): String? = unwrap(this).getCoreDefinitionVersionArn()

    public fun deviceDefinitionVersionArn(): String? = unwrap(this).getDeviceDefinitionVersionArn()

    public fun functionDefinitionVersionArn(): String? =
        unwrap(this).getFunctionDefinitionVersionArn()

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

      public fun loggerDefinitionVersionArn(loggerDefinitionVersionArn: String)

      public fun resourceDefinitionVersionArn(resourceDefinitionVersionArn: String)

      public fun subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnGroup.GroupVersionProperty.Builder =
          software.amazon.awscdk.services.greengrass.CfnGroup.GroupVersionProperty.builder()

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

      override fun loggerDefinitionVersionArn(loggerDefinitionVersionArn: String) {
        cdkBuilder.loggerDefinitionVersionArn(loggerDefinitionVersionArn)
      }

      override fun resourceDefinitionVersionArn(resourceDefinitionVersionArn: String) {
        cdkBuilder.resourceDefinitionVersionArn(resourceDefinitionVersionArn)
      }

      override fun subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn: String) {
        cdkBuilder.subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn)
      }

      public fun build(): software.amazon.awscdk.services.greengrass.CfnGroup.GroupVersionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnGroup.GroupVersionProperty,
    ) : CdkObject(cdkObject), GroupVersionProperty {
      override fun connectorDefinitionVersionArn(): String? =
          unwrap(this).getConnectorDefinitionVersionArn()

      override fun coreDefinitionVersionArn(): String? = unwrap(this).getCoreDefinitionVersionArn()

      override fun deviceDefinitionVersionArn(): String? =
          unwrap(this).getDeviceDefinitionVersionArn()

      override fun functionDefinitionVersionArn(): String? =
          unwrap(this).getFunctionDefinitionVersionArn()

      override fun loggerDefinitionVersionArn(): String? =
          unwrap(this).getLoggerDefinitionVersionArn()

      override fun resourceDefinitionVersionArn(): String? =
          unwrap(this).getResourceDefinitionVersionArn()

      override fun subscriptionDefinitionVersionArn(): String? =
          unwrap(this).getSubscriptionDefinitionVersionArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GroupVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnGroup.GroupVersionProperty):
          GroupVersionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GroupVersionProperty):
          software.amazon.awscdk.services.greengrass.CfnGroup.GroupVersionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnGroup.GroupVersionProperty
    }
  }
}