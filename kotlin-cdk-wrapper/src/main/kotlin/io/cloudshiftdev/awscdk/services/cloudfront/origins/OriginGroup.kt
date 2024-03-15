@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront.origins

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudfront.IOrigin
import io.cloudshiftdev.awscdk.services.cloudfront.OriginBindConfig
import io.cloudshiftdev.awscdk.services.cloudfront.OriginBindOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class OriginGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.origins.OriginGroup,
) : CdkObject(cdkObject), IOrigin {
  public override fun bind(scope: Construct, options: OriginBindOptions): OriginBindConfig =
      unwrap(this).bind(scope.let(Construct::unwrap),
      options.let(OriginBindOptions::unwrap)).let(OriginBindConfig::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a4d8f445ceb4e4ebb177be4645de7fd3d72f0f5d66bcf420280cc1b7bc73b342")
  public override fun bind(scope: Construct, options: OriginBindOptions.Builder.() -> Unit):
      OriginBindConfig = bind(scope, OriginBindOptions(options))

  @CdkDslMarker
  public interface Builder {
    public fun fallbackOrigin(fallbackOrigin: IOrigin)

    public fun fallbackStatusCodes(fallbackStatusCodes: List<Number>)

    public fun fallbackStatusCodes(vararg fallbackStatusCodes: Number)

    public fun primaryOrigin(primaryOrigin: IOrigin)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.origins.OriginGroup.Builder =
        software.amazon.awscdk.services.cloudfront.origins.OriginGroup.Builder.create()

    override fun fallbackOrigin(fallbackOrigin: IOrigin) {
      cdkBuilder.fallbackOrigin(fallbackOrigin.let(IOrigin::unwrap))
    }

    override fun fallbackStatusCodes(fallbackStatusCodes: List<Number>) {
      cdkBuilder.fallbackStatusCodes(fallbackStatusCodes)
    }

    override fun fallbackStatusCodes(vararg fallbackStatusCodes: Number): Unit =
        fallbackStatusCodes(fallbackStatusCodes.toList())

    override fun primaryOrigin(primaryOrigin: IOrigin) {
      cdkBuilder.primaryOrigin(primaryOrigin.let(IOrigin::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.origins.OriginGroup =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OriginGroup {
      val builderImpl = BuilderImpl()
      return OriginGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.origins.OriginGroup):
        OriginGroup = OriginGroup(cdkObject)

    internal fun unwrap(wrapped: OriginGroup):
        software.amazon.awscdk.services.cloudfront.origins.OriginGroup = wrapped.cdkObject
  }
}
