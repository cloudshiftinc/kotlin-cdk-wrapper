@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface VersionWeight {
  public fun version(): IVersion

  public fun weight(): Number

  @CdkDslMarker
  public interface Builder {
    public fun version(version: IVersion)

    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.VersionWeight.Builder =
        software.amazon.awscdk.services.lambda.VersionWeight.builder()

    override fun version(version: IVersion) {
      cdkBuilder.version(version.let(IVersion::unwrap))
    }

    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.lambda.VersionWeight = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.VersionWeight,
  ) : CdkObject(cdkObject), VersionWeight {
    override fun version(): IVersion = unwrap(this).getVersion().let(IVersion::wrap)

    override fun weight(): Number = unwrap(this).getWeight()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VersionWeight {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.VersionWeight):
        VersionWeight = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VersionWeight):
        software.amazon.awscdk.services.lambda.VersionWeight = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.VersionWeight
  }
}
