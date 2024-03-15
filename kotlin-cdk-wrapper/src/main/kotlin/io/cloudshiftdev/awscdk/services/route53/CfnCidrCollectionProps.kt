@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnCidrCollectionProps {
  public fun locations(): Any? = unwrap(this).getLocations()

  public fun name(): String

  @CdkDslMarker
  public interface Builder {
    public fun locations(locations: IResolvable)

    public fun locations(locations: List<Any>)

    public fun locations(vararg locations: Any)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnCidrCollectionProps.Builder =
        software.amazon.awscdk.services.route53.CfnCidrCollectionProps.builder()

    override fun locations(locations: IResolvable) {
      cdkBuilder.locations(locations.let(IResolvable::unwrap))
    }

    override fun locations(locations: List<Any>) {
      cdkBuilder.locations(locations)
    }

    override fun locations(vararg locations: Any): Unit = locations(locations.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.route53.CfnCidrCollectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.CfnCidrCollectionProps,
  ) : CdkObject(cdkObject), CfnCidrCollectionProps {
    override fun locations(): Any? = unwrap(this).getLocations()

    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCidrCollectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnCidrCollectionProps):
        CfnCidrCollectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCidrCollectionProps):
        software.amazon.awscdk.services.route53.CfnCidrCollectionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.CfnCidrCollectionProps
  }
}
