@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnFleetProps {
  public fun baseCapacity(): Number? = unwrap(this).getBaseCapacity()

  public fun computeType(): String? = unwrap(this).getComputeType()

  public fun environmentType(): String? = unwrap(this).getEnvironmentType()

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun baseCapacity(baseCapacity: Number)

    public fun computeType(computeType: String)

    public fun environmentType(environmentType: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.CfnFleetProps.Builder =
        software.amazon.awscdk.services.codebuild.CfnFleetProps.builder()

    override fun baseCapacity(baseCapacity: Number) {
      cdkBuilder.baseCapacity(baseCapacity)
    }

    override fun computeType(computeType: String) {
      cdkBuilder.computeType(computeType)
    }

    override fun environmentType(environmentType: String) {
      cdkBuilder.environmentType(environmentType)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codebuild.CfnFleetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.CfnFleetProps,
  ) : CdkObject(cdkObject), CfnFleetProps {
    override fun baseCapacity(): Number? = unwrap(this).getBaseCapacity()

    override fun computeType(): String? = unwrap(this).getComputeType()

    override fun environmentType(): String? = unwrap(this).getEnvironmentType()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnFleetProps):
        CfnFleetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFleetProps):
        software.amazon.awscdk.services.codebuild.CfnFleetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.codebuild.CfnFleetProps
  }
}
