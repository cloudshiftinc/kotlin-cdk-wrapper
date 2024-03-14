package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstance internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnInstance,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrInstanceStatus(): String = unwrap(this).getAttrInstanceStatus()

  public open fun attrServiceRole(): String = unwrap(this).getAttrServiceRole()

  public open fun attributes(): Any = unwrap(this).getAttributes()

  public open fun attributes(`value`: IResolvable) {
    unwrap(this).setAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun attributes(`value`: AttributesProperty) {
    unwrap(this).setAttributes(`value`.let(AttributesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4a5ec54cfdae16c873c4f812b85e8ece8888e2eeab8bd17d1be1ca9a33563feb")
  public open fun attributes(`value`: AttributesProperty.Builder.() -> Unit): Unit =
      attributes(AttributesProperty(`value`))

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun directoryId(): String? = unwrap(this).getDirectoryId()

  public open fun directoryId(`value`: String) {
    unwrap(this).setDirectoryId(`value`)
  }

  public open fun identityManagementType(): String = unwrap(this).getIdentityManagementType()

  public open fun identityManagementType(`value`: String) {
    unwrap(this).setIdentityManagementType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceAlias(): String? = unwrap(this).getInstanceAlias()

  public open fun instanceAlias(`value`: String) {
    unwrap(this).setInstanceAlias(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun attributes(attributes: IResolvable) {
    }

    public fun attributes(attributes: AttributesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("400110a7d8d59f03f56537f5d326d22abaeb5d6e402b20b389ae4815102f63c6")
    public fun attributes(attributes: AttributesProperty.Builder.() -> Unit) {
    }

    public fun directoryId(directoryId: String) {
    }

    public fun identityManagementType(identityManagementType: String) {
    }

    public fun instanceAlias(instanceAlias: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnInstance.Builder =
        software.amazon.awscdk.services.connect.CfnInstance.Builder.create(scope, id)

    public override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    public override fun attributes(attributes: AttributesProperty) {
      cdkBuilder.attributes(attributes.let(AttributesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("400110a7d8d59f03f56537f5d326d22abaeb5d6e402b20b389ae4815102f63c6")
    public override fun attributes(attributes: AttributesProperty.Builder.() -> Unit): Unit =
        attributes(AttributesProperty(attributes))

    public override fun directoryId(directoryId: String) {
      cdkBuilder.directoryId(directoryId)
    }

    public override fun identityManagementType(identityManagementType: String) {
      cdkBuilder.identityManagementType(identityManagementType)
    }

    public override fun instanceAlias(instanceAlias: String) {
      cdkBuilder.instanceAlias(instanceAlias)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnInstance = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstance): CfnInstance =
        CfnInstance(cdkObject)

    internal fun unwrap(wrapped: CfnInstance): software.amazon.awscdk.services.connect.CfnInstance =
        wrapped.cdkObject
  }

  public interface AttributesProperty {
    public fun autoResolveBestVoices(): Any? = unwrap(this).getAutoResolveBestVoices()

    public fun contactLens(): Any? = unwrap(this).getContactLens()

    public fun contactflowLogs(): Any? = unwrap(this).getContactflowLogs()

    public fun earlyMedia(): Any? = unwrap(this).getEarlyMedia()

    public fun inboundCalls(): Any

    public fun outboundCalls(): Any

    public fun useCustomTtsVoices(): Any? = unwrap(this).getUseCustomTtsVoices()

    public interface Builder {
      public fun autoResolveBestVoices(autoResolveBestVoices: Boolean) {
      }

      public fun autoResolveBestVoices(autoResolveBestVoices: IResolvable) {
      }

      public fun contactLens(contactLens: Boolean) {
      }

      public fun contactLens(contactLens: IResolvable) {
      }

      public fun contactflowLogs(contactflowLogs: Boolean) {
      }

      public fun contactflowLogs(contactflowLogs: IResolvable) {
      }

      public fun earlyMedia(earlyMedia: Boolean) {
      }

      public fun earlyMedia(earlyMedia: IResolvable) {
      }

      public fun inboundCalls(inboundCalls: Boolean) {
      }

      public fun inboundCalls(inboundCalls: IResolvable) {
      }

      public fun outboundCalls(outboundCalls: Boolean) {
      }

      public fun outboundCalls(outboundCalls: IResolvable) {
      }

      public fun useCustomTtsVoices(useCustomTtsVoices: Boolean) {
      }

      public fun useCustomTtsVoices(useCustomTtsVoices: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnInstance.AttributesProperty.Builder =
          software.amazon.awscdk.services.connect.CfnInstance.AttributesProperty.builder()

      public override fun autoResolveBestVoices(autoResolveBestVoices: Boolean) {
        cdkBuilder.autoResolveBestVoices(autoResolveBestVoices)
      }

      public override fun autoResolveBestVoices(autoResolveBestVoices: IResolvable) {
        cdkBuilder.autoResolveBestVoices(autoResolveBestVoices.let(IResolvable::unwrap))
      }

      public override fun contactLens(contactLens: Boolean) {
        cdkBuilder.contactLens(contactLens)
      }

      public override fun contactLens(contactLens: IResolvable) {
        cdkBuilder.contactLens(contactLens.let(IResolvable::unwrap))
      }

      public override fun contactflowLogs(contactflowLogs: Boolean) {
        cdkBuilder.contactflowLogs(contactflowLogs)
      }

      public override fun contactflowLogs(contactflowLogs: IResolvable) {
        cdkBuilder.contactflowLogs(contactflowLogs.let(IResolvable::unwrap))
      }

      public override fun earlyMedia(earlyMedia: Boolean) {
        cdkBuilder.earlyMedia(earlyMedia)
      }

      public override fun earlyMedia(earlyMedia: IResolvable) {
        cdkBuilder.earlyMedia(earlyMedia.let(IResolvable::unwrap))
      }

      public override fun inboundCalls(inboundCalls: Boolean) {
        cdkBuilder.inboundCalls(inboundCalls)
      }

      public override fun inboundCalls(inboundCalls: IResolvable) {
        cdkBuilder.inboundCalls(inboundCalls.let(IResolvable::unwrap))
      }

      public override fun outboundCalls(outboundCalls: Boolean) {
        cdkBuilder.outboundCalls(outboundCalls)
      }

      public override fun outboundCalls(outboundCalls: IResolvable) {
        cdkBuilder.outboundCalls(outboundCalls.let(IResolvable::unwrap))
      }

      public override fun useCustomTtsVoices(useCustomTtsVoices: Boolean) {
        cdkBuilder.useCustomTtsVoices(useCustomTtsVoices)
      }

      public override fun useCustomTtsVoices(useCustomTtsVoices: IResolvable) {
        cdkBuilder.useCustomTtsVoices(useCustomTtsVoices.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnInstance.AttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnInstance.AttributesProperty,
    ) : AttributesProperty {
      public override fun autoResolveBestVoices(): Any? = unwrap(this).getAutoResolveBestVoices()

      public override fun contactLens(): Any? = unwrap(this).getContactLens()

      public override fun contactflowLogs(): Any? = unwrap(this).getContactflowLogs()

      public override fun earlyMedia(): Any? = unwrap(this).getEarlyMedia()

      public override fun inboundCalls(): Any = unwrap(this).getInboundCalls()

      public override fun outboundCalls(): Any = unwrap(this).getOutboundCalls()

      public override fun useCustomTtsVoices(): Any? = unwrap(this).getUseCustomTtsVoices()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstance.AttributesProperty):
          AttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributesProperty):
          software.amazon.awscdk.services.connect.CfnInstance.AttributesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
