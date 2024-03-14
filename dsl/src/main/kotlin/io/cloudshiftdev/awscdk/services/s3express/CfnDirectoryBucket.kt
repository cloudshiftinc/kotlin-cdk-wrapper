package io.cloudshiftdev.awscdk.services.s3express

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDirectoryBucket internal constructor(
  private val cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucket,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun bucketName(): String? = unwrap(this).getBucketName()

  public open fun bucketName(`value`: String) {
    unwrap(this).setBucketName(`value`)
  }

  public open fun dataRedundancy(): String = unwrap(this).getDataRedundancy()

  public open fun dataRedundancy(`value`: String) {
    unwrap(this).setDataRedundancy(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun locationName(): String = unwrap(this).getLocationName()

  public open fun locationName(`value`: String) {
    unwrap(this).setLocationName(`value`)
  }

  public interface Builder {
    public fun bucketName(bucketName: String) {
    }

    public fun dataRedundancy(dataRedundancy: String) {
    }

    public fun locationName(locationName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3express.CfnDirectoryBucket.Builder =
        software.amazon.awscdk.services.s3express.CfnDirectoryBucket.Builder.create(scope, id)

    public override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    public override fun dataRedundancy(dataRedundancy: String) {
      cdkBuilder.dataRedundancy(dataRedundancy)
    }

    public override fun locationName(locationName: String) {
      cdkBuilder.locationName(locationName)
    }

    public fun build(): software.amazon.awscdk.services.s3express.CfnDirectoryBucket =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDirectoryBucket {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDirectoryBucket(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucket):
        CfnDirectoryBucket = CfnDirectoryBucket(cdkObject)

    internal fun unwrap(wrapped: CfnDirectoryBucket):
        software.amazon.awscdk.services.s3express.CfnDirectoryBucket = wrapped.cdkObject
  }
}
