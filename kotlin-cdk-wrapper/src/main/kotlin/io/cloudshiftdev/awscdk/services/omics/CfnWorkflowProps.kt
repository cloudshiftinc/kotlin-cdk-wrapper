@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.omics

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnWorkflowProps {
  public fun accelerators(): String? = unwrap(this).getAccelerators()

  public fun definitionUri(): String? = unwrap(this).getDefinitionUri()

  public fun description(): String? = unwrap(this).getDescription()

  public fun engine(): String? = unwrap(this).getEngine()

  public fun main(): String? = unwrap(this).getMain()

  public fun name(): String? = unwrap(this).getName()

  public fun parameterTemplate(): Any? = unwrap(this).getParameterTemplate()

  public fun storageCapacity(): Number? = unwrap(this).getStorageCapacity()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnWorkflowProps.Builder =
        software.amazon.awscdk.services.omics.CfnWorkflowProps.builder()

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

    public fun build(): software.amazon.awscdk.services.omics.CfnWorkflowProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.omics.CfnWorkflowProps,
  ) : CdkObject(cdkObject), CfnWorkflowProps {
    override fun accelerators(): String? = unwrap(this).getAccelerators()

    override fun definitionUri(): String? = unwrap(this).getDefinitionUri()

    override fun description(): String? = unwrap(this).getDescription()

    override fun engine(): String? = unwrap(this).getEngine()

    override fun main(): String? = unwrap(this).getMain()

    override fun name(): String? = unwrap(this).getName()

    override fun parameterTemplate(): Any? = unwrap(this).getParameterTemplate()

    override fun storageCapacity(): Number? = unwrap(this).getStorageCapacity()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkflowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnWorkflowProps):
        CfnWorkflowProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkflowProps):
        software.amazon.awscdk.services.omics.CfnWorkflowProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.omics.CfnWorkflowProps
  }
}
