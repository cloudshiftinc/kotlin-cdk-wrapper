@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface Environment {
  public fun account(): String? = unwrap(this).getAccount()

  public fun region(): String? = unwrap(this).getRegion()

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.Environment.Builder =
        software.amazon.awscdk.Environment.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.Environment = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.Environment,
  ) : CdkObject(cdkObject), Environment {
    override fun account(): String? = unwrap(this).getAccount()

    override fun region(): String? = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Environment {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.Environment): Environment =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Environment): software.amazon.awscdk.Environment = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.Environment
  }
}
