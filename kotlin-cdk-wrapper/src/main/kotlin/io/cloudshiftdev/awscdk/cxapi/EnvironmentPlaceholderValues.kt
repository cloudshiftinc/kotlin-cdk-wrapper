@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface EnvironmentPlaceholderValues {
  public fun accountId(): String

  public fun partition(): String

  public fun region(): String

  @CdkDslMarker
  public interface Builder {
    public fun accountId(accountId: String)

    public fun partition(partition: String)

    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues.Builder =
        software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues.builder()

    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    override fun partition(partition: String) {
      cdkBuilder.partition(partition)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues,
  ) : CdkObject(cdkObject), EnvironmentPlaceholderValues {
    override fun accountId(): String = unwrap(this).getAccountId()

    override fun partition(): String = unwrap(this).getPartition()

    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentPlaceholderValues {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues):
        EnvironmentPlaceholderValues = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnvironmentPlaceholderValues):
        software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues
  }
}
