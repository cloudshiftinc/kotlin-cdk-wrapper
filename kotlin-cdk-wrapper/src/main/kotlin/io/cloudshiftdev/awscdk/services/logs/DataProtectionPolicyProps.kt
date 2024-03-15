@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface DataProtectionPolicyProps {
  public fun deliveryStreamNameAuditDestination(): String? =
      unwrap(this).getDeliveryStreamNameAuditDestination()

  public fun description(): String? = unwrap(this).getDescription()

  public fun identifiers(): List<DataIdentifier>

  public fun logGroupAuditDestination(): ILogGroup? =
      unwrap(this).getLogGroupAuditDestination()?.let(ILogGroup::wrap)

  public fun name(): String? = unwrap(this).getName()

  public fun s3BucketAuditDestination(): IBucket? =
      unwrap(this).getS3BucketAuditDestination()?.let(IBucket::wrap)

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
    private val cdkBuilder: software.amazon.awscdk.services.logs.DataProtectionPolicyProps.Builder =
        software.amazon.awscdk.services.logs.DataProtectionPolicyProps.builder()

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

    public fun build(): software.amazon.awscdk.services.logs.DataProtectionPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.DataProtectionPolicyProps,
  ) : CdkObject(cdkObject), DataProtectionPolicyProps {
    override fun deliveryStreamNameAuditDestination(): String? =
        unwrap(this).getDeliveryStreamNameAuditDestination()

    override fun description(): String? = unwrap(this).getDescription()

    override fun identifiers(): List<DataIdentifier> =
        unwrap(this).getIdentifiers().map(DataIdentifier::wrap)

    override fun logGroupAuditDestination(): ILogGroup? =
        unwrap(this).getLogGroupAuditDestination()?.let(ILogGroup::wrap)

    override fun name(): String? = unwrap(this).getName()

    override fun s3BucketAuditDestination(): IBucket? =
        unwrap(this).getS3BucketAuditDestination()?.let(IBucket::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DataProtectionPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.DataProtectionPolicyProps):
        DataProtectionPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DataProtectionPolicyProps):
        software.amazon.awscdk.services.logs.DataProtectionPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.DataProtectionPolicyProps
  }
}
