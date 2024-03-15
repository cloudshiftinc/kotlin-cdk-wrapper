@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class DataProtectionPolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.DataProtectionPolicy,
) : CdkObject(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun deliveryStreamNameAuditDestination(deliveryStreamNameAuditDestination: String)

    public fun description(description: String)

    public fun identifiers(identifiers: List<DataIdentifier>)

    public fun identifiers(vararg identifiers: DataIdentifier)

    public fun logGroupAuditDestination(logGroupAuditDestination: ILogGroup)

    public fun name(name: String)

    public fun s3BucketAuditDestination(s3BucketAuditDestination: IBucket)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.DataProtectionPolicy.Builder =
        software.amazon.awscdk.services.logs.DataProtectionPolicy.Builder.create()

    override fun deliveryStreamNameAuditDestination(deliveryStreamNameAuditDestination: String) {
      cdkBuilder.deliveryStreamNameAuditDestination(deliveryStreamNameAuditDestination)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun identifiers(identifiers: List<DataIdentifier>) {
      cdkBuilder.identifiers(identifiers.map(DataIdentifier::unwrap))
    }

    override fun identifiers(vararg identifiers: DataIdentifier): Unit =
        identifiers(identifiers.toList())

    override fun logGroupAuditDestination(logGroupAuditDestination: ILogGroup) {
      cdkBuilder.logGroupAuditDestination(logGroupAuditDestination.let(ILogGroup::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun s3BucketAuditDestination(s3BucketAuditDestination: IBucket) {
      cdkBuilder.s3BucketAuditDestination(s3BucketAuditDestination.let(IBucket::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.DataProtectionPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DataProtectionPolicy {
      val builderImpl = BuilderImpl()
      return DataProtectionPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.DataProtectionPolicy):
        DataProtectionPolicy = DataProtectionPolicy(cdkObject)

    internal fun unwrap(wrapped: DataProtectionPolicy):
        software.amazon.awscdk.services.logs.DataProtectionPolicy = wrapped.cdkObject
  }
}
