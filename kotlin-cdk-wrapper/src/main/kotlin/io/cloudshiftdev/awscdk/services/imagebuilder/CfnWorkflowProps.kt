@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnWorkflowProps {
  public fun changeDescription(): String? = unwrap(this).getChangeDescription()

  public fun `data`(): String? = unwrap(this).getData()

  public fun description(): String? = unwrap(this).getDescription()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun name(): String

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun type(): String

  public fun uri(): String? = unwrap(this).getUri()

  public fun version(): String

  @CdkDslMarker
  public interface Builder {
    public fun changeDescription(changeDescription: String)

    public fun `data`(`data`: String)

    public fun description(description: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun name(name: String)

    public fun tags(tags: Map<String, String>)

    public fun type(type: String)

    public fun uri(uri: String)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnWorkflowProps.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnWorkflowProps.builder()

    override fun changeDescription(changeDescription: String) {
      cdkBuilder.changeDescription(changeDescription)
    }

    override fun `data`(`data`: String) {
      cdkBuilder.`data`(`data`)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnWorkflowProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnWorkflowProps,
  ) : CdkObject(cdkObject), CfnWorkflowProps {
    override fun changeDescription(): String? = unwrap(this).getChangeDescription()

    override fun `data`(): String? = unwrap(this).getData()

    override fun description(): String? = unwrap(this).getDescription()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun type(): String = unwrap(this).getType()

    override fun uri(): String? = unwrap(this).getUri()

    override fun version(): String = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkflowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnWorkflowProps):
        CfnWorkflowProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkflowProps):
        software.amazon.awscdk.services.imagebuilder.CfnWorkflowProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.imagebuilder.CfnWorkflowProps
  }
}
