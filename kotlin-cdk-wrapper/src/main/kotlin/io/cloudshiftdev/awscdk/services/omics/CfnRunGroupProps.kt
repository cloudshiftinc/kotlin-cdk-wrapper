@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.omics

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnRunGroupProps {
  public fun maxCpus(): Number? = unwrap(this).getMaxCpus()

  public fun maxDuration(): Number? = unwrap(this).getMaxDuration()

  public fun maxGpus(): Number? = unwrap(this).getMaxGpus()

  public fun maxRuns(): Number? = unwrap(this).getMaxRuns()

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun maxCpus(maxCpus: Number)

    public fun maxDuration(maxDuration: Number)

    public fun maxGpus(maxGpus: Number)

    public fun maxRuns(maxRuns: Number)

    public fun name(name: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnRunGroupProps.Builder =
        software.amazon.awscdk.services.omics.CfnRunGroupProps.builder()

    override fun maxCpus(maxCpus: Number) {
      cdkBuilder.maxCpus(maxCpus)
    }

    override fun maxDuration(maxDuration: Number) {
      cdkBuilder.maxDuration(maxDuration)
    }

    override fun maxGpus(maxGpus: Number) {
      cdkBuilder.maxGpus(maxGpus)
    }

    override fun maxRuns(maxRuns: Number) {
      cdkBuilder.maxRuns(maxRuns)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnRunGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.omics.CfnRunGroupProps,
  ) : CdkObject(cdkObject), CfnRunGroupProps {
    override fun maxCpus(): Number? = unwrap(this).getMaxCpus()

    override fun maxDuration(): Number? = unwrap(this).getMaxDuration()

    override fun maxGpus(): Number? = unwrap(this).getMaxGpus()

    override fun maxRuns(): Number? = unwrap(this).getMaxRuns()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRunGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnRunGroupProps):
        CfnRunGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRunGroupProps):
        software.amazon.awscdk.services.omics.CfnRunGroupProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.omics.CfnRunGroupProps
  }
}
