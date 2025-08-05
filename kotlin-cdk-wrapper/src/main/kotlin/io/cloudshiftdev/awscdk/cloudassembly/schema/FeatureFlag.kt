@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface FeatureFlag {
  public fun explanation(): String? = unwrap(this).getExplanation()

  public fun recommendedValue(): Any? = unwrap(this).getRecommendedValue()

  public fun userValue(): Any? = unwrap(this).getUserValue()

  @CdkDslMarker
  public interface Builder {
    public fun explanation(explanation: String)

    public fun recommendedValue(recommendedValue: Any)

    public fun userValue(userValue: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.FeatureFlag.Builder =
        software.amazon.awscdk.cloudassembly.schema.FeatureFlag.builder()

    override fun explanation(explanation: String) {
      cdkBuilder.explanation(explanation)
    }

    override fun recommendedValue(recommendedValue: Any) {
      cdkBuilder.recommendedValue(recommendedValue)
    }

    override fun userValue(userValue: Any) {
      cdkBuilder.userValue(userValue)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.FeatureFlag = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.FeatureFlag,
  ) : CdkObject(cdkObject),
      FeatureFlag {
    override fun explanation(): String? = unwrap(this).getExplanation()

    override fun recommendedValue(): Any? = unwrap(this).getRecommendedValue()

    override fun userValue(): Any? = unwrap(this).getUserValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FeatureFlag {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.FeatureFlag):
        FeatureFlag = CdkObjectWrappers.wrap(cdkObject) as? FeatureFlag ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FeatureFlag):
        software.amazon.awscdk.cloudassembly.schema.FeatureFlag = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cloudassembly.schema.FeatureFlag
  }
}
