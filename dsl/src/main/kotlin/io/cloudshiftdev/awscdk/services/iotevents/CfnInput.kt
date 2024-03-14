package io.cloudshiftdev.awscdk.services.iotevents

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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

public open class CfnInput internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotevents.CfnInput,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun inputDefinition(): Any = unwrap(this).getInputDefinition()

  public open fun inputDefinition(`value`: IResolvable) {
    unwrap(this).setInputDefinition(`value`.let(IResolvable::unwrap))
  }

  public open fun inputDefinition(`value`: InputDefinitionProperty) {
    unwrap(this).setInputDefinition(`value`.let(InputDefinitionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("744a31907899d79c25d1bcfde3cd85ac503a5ff0244bca6aeeddf776fdbab4e5")
  public open fun inputDefinition(`value`: InputDefinitionProperty.Builder.() -> Unit): Unit =
      inputDefinition(InputDefinitionProperty(`value`))

  public open fun inputDescription(): String? = unwrap(this).getInputDescription()

  public open fun inputDescription(`value`: String) {
    unwrap(this).setInputDescription(`value`)
  }

  public open fun inputName(): String? = unwrap(this).getInputName()

  public open fun inputName(`value`: String) {
    unwrap(this).setInputName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun inputDefinition(inputDefinition: IResolvable)

    public fun inputDefinition(inputDefinition: InputDefinitionProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e29149db2e0b6786b9737a01c465fc73f7fd99ee7ba077b14a1716b68649e11f")
    public fun inputDefinition(inputDefinition: InputDefinitionProperty.Builder.() -> Unit)

    public fun inputDescription(inputDescription: String)

    public fun inputName(inputName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotevents.CfnInput.Builder =
        software.amazon.awscdk.services.iotevents.CfnInput.Builder.create(scope, id)

    override fun inputDefinition(inputDefinition: IResolvable) {
      cdkBuilder.inputDefinition(inputDefinition.let(IResolvable::unwrap))
    }

    override fun inputDefinition(inputDefinition: InputDefinitionProperty) {
      cdkBuilder.inputDefinition(inputDefinition.let(InputDefinitionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e29149db2e0b6786b9737a01c465fc73f7fd99ee7ba077b14a1716b68649e11f")
    override fun inputDefinition(inputDefinition: InputDefinitionProperty.Builder.() -> Unit): Unit
        = inputDefinition(InputDefinitionProperty(inputDefinition))

    override fun inputDescription(inputDescription: String) {
      cdkBuilder.inputDescription(inputDescription)
    }

    override fun inputName(inputName: String) {
      cdkBuilder.inputName(inputName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotevents.CfnInput = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInput {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInput(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnInput): CfnInput =
        CfnInput(cdkObject)

    internal fun unwrap(wrapped: CfnInput): software.amazon.awscdk.services.iotevents.CfnInput =
        wrapped.cdkObject
  }

  public interface AttributeProperty {
    public fun jsonPath(): String

    public interface Builder {
      public fun jsonPath(jsonPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnInput.AttributeProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnInput.AttributeProperty.builder()

      override fun jsonPath(jsonPath: String) {
        cdkBuilder.jsonPath(jsonPath)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnInput.AttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iotevents.CfnInput.AttributeProperty,
    ) : AttributeProperty {
      override fun jsonPath(): String = unwrap(this).getJsonPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnInput.AttributeProperty):
          AttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeProperty):
          software.amazon.awscdk.services.iotevents.CfnInput.AttributeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface InputDefinitionProperty {
    public fun attributes(): Any

    public interface Builder {
      public fun attributes(attributes: IResolvable)

      public fun attributes(attributes: List<Any>)

      public fun attributes(vararg attributes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty.builder()

      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      override fun attributes(attributes: List<Any>) {
        cdkBuilder.attributes(attributes)
      }

      override fun attributes(vararg attributes: Any): Unit = attributes(attributes.toList())

      public fun build(): software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty,
    ) : InputDefinitionProperty {
      override fun attributes(): Any = unwrap(this).getAttributes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty):
          InputDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputDefinitionProperty):
          software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
