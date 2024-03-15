@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ResourceProps {
  public fun account(): String? = unwrap(this).getAccount()

  public fun environmentFromArn(): String? = unwrap(this).getEnvironmentFromArn()

  public fun physicalName(): String? = unwrap(this).getPhysicalName()

  public fun region(): String? = unwrap(this).getRegion()

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun environmentFromArn(environmentFromArn: String)

    public fun physicalName(physicalName: String)

    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.ResourceProps.Builder =
        software.amazon.awscdk.ResourceProps.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun environmentFromArn(environmentFromArn: String) {
      cdkBuilder.environmentFromArn(environmentFromArn)
    }

    override fun physicalName(physicalName: String) {
      cdkBuilder.physicalName(physicalName)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.ResourceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ResourceProps,
  ) : CdkObject(cdkObject), ResourceProps {
    override fun account(): String? = unwrap(this).getAccount()

    override fun environmentFromArn(): String? = unwrap(this).getEnvironmentFromArn()

    override fun physicalName(): String? = unwrap(this).getPhysicalName()

    override fun region(): String? = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ResourceProps): ResourceProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourceProps): software.amazon.awscdk.ResourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.ResourceProps
  }
}
