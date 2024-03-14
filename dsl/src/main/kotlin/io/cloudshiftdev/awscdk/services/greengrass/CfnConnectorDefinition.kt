package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConnectorDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLatestVersionArn(): String = unwrap(this).getAttrLatestVersionArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  public open fun initialVersion(`value`: IResolvable) {
    unwrap(this).setInitialVersion(`value`.let(IResolvable::unwrap))
  }

  public open fun initialVersion(`value`: ConnectorDefinitionVersionProperty) {
    unwrap(this).setInitialVersion(`value`.let(ConnectorDefinitionVersionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a2b68da37f6052c80ca9ba4025714739b14c81f8740c8601827fefb826347765")
  public open fun initialVersion(`value`: ConnectorDefinitionVersionProperty.Builder.() -> Unit):
      Unit = initialVersion(ConnectorDefinitionVersionProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun initialVersion(initialVersion: IResolvable) {
    }

    public fun initialVersion(initialVersion: ConnectorDefinitionVersionProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c0c4a9d9fbc3e55af357aacd2c5a4c550b4a16d3bba813adfe8297c0bec8a85")
    public
        fun initialVersion(initialVersion: ConnectorDefinitionVersionProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    public fun tags(tags: Any) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.Builder =
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.Builder.create(scope, id)

    public override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    public override fun initialVersion(initialVersion: ConnectorDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(ConnectorDefinitionVersionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c0c4a9d9fbc3e55af357aacd2c5a4c550b4a16d3bba813adfe8297c0bec8a85")
    public override
        fun initialVersion(initialVersion: ConnectorDefinitionVersionProperty.Builder.() -> Unit):
        Unit = initialVersion(ConnectorDefinitionVersionProperty(initialVersion))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnConnectorDefinition =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnectorDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnectorDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinition):
        CfnConnectorDefinition = CfnConnectorDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorDefinition):
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinition = wrapped.cdkObject
  }

  public interface ConnectorProperty {
    public fun connectorArn(): String

    public fun id(): String

    public fun parameters(): Any? = unwrap(this).getParameters()

    public interface Builder {
      public fun connectorArn(connectorArn: String) {
      }

      public fun id(id: String) {
      }

      public fun parameters(parameters: Any) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorProperty.builder()

      public override fun connectorArn(connectorArn: String) {
        cdkBuilder.connectorArn(connectorArn)
      }

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorProperty,
    ) : ConnectorProperty {
      public override fun connectorArn(): String = unwrap(this).getConnectorArn()

      public override fun id(): String = unwrap(this).getId()

      public override fun parameters(): Any? = unwrap(this).getParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorProperty):
          ConnectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorProperty):
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConnectorDefinitionVersionProperty {
    public fun connectors(): Any

    public interface Builder {
      public fun connectors(connectors: IResolvable) {
      }

      public fun connectors(connectors: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorDefinitionVersionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorDefinitionVersionProperty.builder()

      public override fun connectors(connectors: IResolvable) {
        cdkBuilder.connectors(connectors.let(IResolvable::unwrap))
      }

      public override fun connectors(connectors: List<Any>) {
        cdkBuilder.connectors(connectors)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorDefinitionVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorDefinitionVersionProperty,
    ) : ConnectorDefinitionVersionProperty {
      public override fun connectors(): Any = unwrap(this).getConnectors()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectorDefinitionVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorDefinitionVersionProperty):
          ConnectorDefinitionVersionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorDefinitionVersionProperty):
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorDefinitionVersionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
