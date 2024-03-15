@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPromptProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun instanceArn(): String

  public fun name(): String

  public fun s3Uri(): String? = unwrap(this).getS3Uri()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun instanceArn(instanceArn: String)

    public fun name(name: String)

    public fun s3Uri(s3Uri: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnPromptProps.Builder =
        software.amazon.awscdk.services.connect.CfnPromptProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun s3Uri(s3Uri: String) {
      cdkBuilder.s3Uri(s3Uri)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnPromptProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnPromptProps,
  ) : CdkObject(cdkObject), CfnPromptProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    override fun name(): String = unwrap(this).getName()

    override fun s3Uri(): String? = unwrap(this).getS3Uri()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPromptProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnPromptProps):
        CfnPromptProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPromptProps):
        software.amazon.awscdk.services.connect.CfnPromptProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.connect.CfnPromptProps
  }
}
