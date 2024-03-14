package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnExtension internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appconfig.CfnExtension,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun actions(): Any = unwrap(this).getActions()

  public open fun actions(`value`: Any) {
    unwrap(this).setActions(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrVersionNumber(): Number = unwrap(this).getAttrVersionNumber()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

  public open fun latestVersionNumber(`value`: Number) {
    unwrap(this).setLatestVersionNumber(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun parameters(): Any? = unwrap(this).getParameters()

  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun parameters(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setParameters(__item_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun actions(actions: Any)

    public fun description(description: String)

    public fun latestVersionNumber(latestVersionNumber: Number)

    public fun name(name: String)

    public fun parameters(parameters: IResolvable)

    public fun parameters(parameters: Map<String, Any>)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.CfnExtension.Builder =
        software.amazon.awscdk.services.appconfig.CfnExtension.Builder.create(scope, id)

    override fun actions(actions: Any) {
      cdkBuilder.actions(actions)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun latestVersionNumber(latestVersionNumber: Number) {
      cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appconfig.CfnExtension = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnExtension {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnExtension(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnExtension):
        CfnExtension = CfnExtension(cdkObject)

    internal fun unwrap(wrapped: CfnExtension):
        software.amazon.awscdk.services.appconfig.CfnExtension = wrapped.cdkObject
  }

  public interface ActionProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun name(): String

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public fun uri(): String

    public interface Builder {
      public fun description(description: String)

      public fun name(name: String)

      public fun roleArn(roleArn: String)

      public fun uri(uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appconfig.CfnExtension.ActionProperty.Builder =
          software.amazon.awscdk.services.appconfig.CfnExtension.ActionProperty.builder()

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      public fun build(): software.amazon.awscdk.services.appconfig.CfnExtension.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.appconfig.CfnExtension.ActionProperty,
    ) : ActionProperty {
      override fun description(): String? = unwrap(this).getDescription()

      override fun name(): String = unwrap(this).getName()

      override fun roleArn(): String? = unwrap(this).getRoleArn()

      override fun uri(): String = unwrap(this).getUri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnExtension.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.appconfig.CfnExtension.ActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ParameterProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun required(): Any

    public interface Builder {
      public fun description(description: String)

      public fun required(required: Boolean)

      public fun required(required: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appconfig.CfnExtension.ParameterProperty.Builder =
          software.amazon.awscdk.services.appconfig.CfnExtension.ParameterProperty.builder()

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun required(required: Boolean) {
        cdkBuilder.required(required)
      }

      override fun required(required: IResolvable) {
        cdkBuilder.required(required.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.appconfig.CfnExtension.ParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appconfig.CfnExtension.ParameterProperty,
    ) : ParameterProperty {
      override fun description(): String? = unwrap(this).getDescription()

      override fun required(): Any = unwrap(this).getRequired()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnExtension.ParameterProperty):
          ParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterProperty):
          software.amazon.awscdk.services.appconfig.CfnExtension.ParameterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
