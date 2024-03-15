@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.omics

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWorkflow internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.omics.CfnWorkflow,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accelerators(): String? = unwrap(this).getAccelerators()

  public open fun accelerators(`value`: String) {
    unwrap(this).setAccelerators(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrType(): String = unwrap(this).getAttrType()

  public open fun definitionUri(): String? = unwrap(this).getDefinitionUri()

  public open fun definitionUri(`value`: String) {
    unwrap(this).setDefinitionUri(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun engine(): String? = unwrap(this).getEngine()

  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun main(): String? = unwrap(this).getMain()

  public open fun main(`value`: String) {
    unwrap(this).setMain(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun parameterTemplate(): Any? = unwrap(this).getParameterTemplate()

  public open fun parameterTemplate(`value`: IResolvable) {
    unwrap(this).setParameterTemplate(`value`.let(IResolvable::unwrap))
  }

  public open fun parameterTemplate(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setParameterTemplate(__item_ac66f0)
  }

  public open fun storageCapacity(): Number? = unwrap(this).getStorageCapacity()

  public open fun storageCapacity(`value`: Number) {
    unwrap(this).setStorageCapacity(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun accelerators(accelerators: String)

    public fun definitionUri(definitionUri: String)

    public fun description(description: String)

    public fun engine(engine: String)

    public fun main(main: String)

    public fun name(name: String)

    public fun parameterTemplate(parameterTemplate: IResolvable)

    public fun parameterTemplate(parameterTemplate: Map<String, Any>)

    public fun storageCapacity(storageCapacity: Number)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnWorkflow.Builder =
        software.amazon.awscdk.services.omics.CfnWorkflow.Builder.create(scope, id)

    override fun accelerators(accelerators: String) {
      cdkBuilder.accelerators(accelerators)
    }

    override fun definitionUri(definitionUri: String) {
      cdkBuilder.definitionUri(definitionUri)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    override fun main(main: String) {
      cdkBuilder.main(main)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun parameterTemplate(parameterTemplate: IResolvable) {
      cdkBuilder.parameterTemplate(parameterTemplate.let(IResolvable::unwrap))
    }

    override fun parameterTemplate(parameterTemplate: Map<String, Any>) {
      cdkBuilder.parameterTemplate(parameterTemplate)
    }

    override fun storageCapacity(storageCapacity: Number) {
      cdkBuilder.storageCapacity(storageCapacity)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnWorkflow = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.omics.CfnWorkflow.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkflow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkflow(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnWorkflow): CfnWorkflow =
        CfnWorkflow(cdkObject)

    internal fun unwrap(wrapped: CfnWorkflow): software.amazon.awscdk.services.omics.CfnWorkflow =
        wrapped.cdkObject
  }

  public interface WorkflowParameterProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun optional(): Any? = unwrap(this).getOptional()

    @CdkDslMarker
    public interface Builder {
      public fun description(description: String)

      public fun optional(optional: Boolean)

      public fun optional(optional: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.omics.CfnWorkflow.WorkflowParameterProperty.Builder =
          software.amazon.awscdk.services.omics.CfnWorkflow.WorkflowParameterProperty.builder()

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun optional(optional: Boolean) {
        cdkBuilder.optional(optional)
      }

      override fun optional(optional: IResolvable) {
        cdkBuilder.optional(optional.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.omics.CfnWorkflow.WorkflowParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.omics.CfnWorkflow.WorkflowParameterProperty,
    ) : CdkObject(cdkObject), WorkflowParameterProperty {
      override fun description(): String? = unwrap(this).getDescription()

      override fun optional(): Any? = unwrap(this).getOptional()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnWorkflow.WorkflowParameterProperty):
          WorkflowParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowParameterProperty):
          software.amazon.awscdk.services.omics.CfnWorkflow.WorkflowParameterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.omics.CfnWorkflow.WorkflowParameterProperty
    }
  }
}
