@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

/**
 * A full specification of a delivery stream that can be used to import it fluently into the CDK
 * application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
 * Role role;
 * DeliveryStreamAttributes deliveryStreamAttributes = DeliveryStreamAttributes.builder()
 * .deliveryStreamArn("deliveryStreamArn")
 * .deliveryStreamName("deliveryStreamName")
 * .role(role)
 * .build();
 * ```
 */
public interface DeliveryStreamAttributes {
  /**
   * The ARN of the delivery stream.
   *
   * At least one of deliveryStreamArn and deliveryStreamName must be provided.
   *
   * Default: - derived from `deliveryStreamName`.
   */
  public fun deliveryStreamArn(): String? = unwrap(this).getDeliveryStreamArn()

  /**
   * The name of the delivery stream.
   *
   * At least one of deliveryStreamName and deliveryStreamArn  must be provided.
   *
   * Default: - derived from `deliveryStreamArn`.
   */
  public fun deliveryStreamName(): String? = unwrap(this).getDeliveryStreamName()

  /**
   * The IAM role associated with this delivery stream.
   *
   * Assumed by Amazon Data Firehose to read from sources and encrypt data server-side.
   *
   * Default: - the imported stream cannot be granted access to other resources as an
   * `iam.IGrantable`.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [DeliveryStreamAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deliveryStreamArn The ARN of the delivery stream.
     * At least one of deliveryStreamArn and deliveryStreamName must be provided.
     */
    public fun deliveryStreamArn(deliveryStreamArn: String)

    /**
     * @param deliveryStreamName The name of the delivery stream.
     * At least one of deliveryStreamName and deliveryStreamArn  must be provided.
     */
    public fun deliveryStreamName(deliveryStreamName: String)

    /**
     * @param role The IAM role associated with this delivery stream.
     * Assumed by Amazon Data Firehose to read from sources and encrypt data server-side.
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisfirehose.DeliveryStreamAttributes.Builder =
        software.amazon.awscdk.services.kinesisfirehose.DeliveryStreamAttributes.builder()

    /**
     * @param deliveryStreamArn The ARN of the delivery stream.
     * At least one of deliveryStreamArn and deliveryStreamName must be provided.
     */
    override fun deliveryStreamArn(deliveryStreamArn: String) {
      cdkBuilder.deliveryStreamArn(deliveryStreamArn)
    }

    /**
     * @param deliveryStreamName The name of the delivery stream.
     * At least one of deliveryStreamName and deliveryStreamArn  must be provided.
     */
    override fun deliveryStreamName(deliveryStreamName: String) {
      cdkBuilder.deliveryStreamName(deliveryStreamName)
    }

    /**
     * @param role The IAM role associated with this delivery stream.
     * Assumed by Amazon Data Firehose to read from sources and encrypt data server-side.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kinesisfirehose.DeliveryStreamAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisfirehose.DeliveryStreamAttributes,
  ) : CdkObject(cdkObject),
      DeliveryStreamAttributes {
    /**
     * The ARN of the delivery stream.
     *
     * At least one of deliveryStreamArn and deliveryStreamName must be provided.
     *
     * Default: - derived from `deliveryStreamName`.
     */
    override fun deliveryStreamArn(): String? = unwrap(this).getDeliveryStreamArn()

    /**
     * The name of the delivery stream.
     *
     * At least one of deliveryStreamName and deliveryStreamArn  must be provided.
     *
     * Default: - derived from `deliveryStreamArn`.
     */
    override fun deliveryStreamName(): String? = unwrap(this).getDeliveryStreamName()

    /**
     * The IAM role associated with this delivery stream.
     *
     * Assumed by Amazon Data Firehose to read from sources and encrypt data server-side.
     *
     * Default: - the imported stream cannot be granted access to other resources as an
     * `iam.IGrantable`.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeliveryStreamAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.DeliveryStreamAttributes):
        DeliveryStreamAttributes = CdkObjectWrappers.wrap(cdkObject) as? DeliveryStreamAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeliveryStreamAttributes):
        software.amazon.awscdk.services.kinesisfirehose.DeliveryStreamAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisfirehose.DeliveryStreamAttributes
  }
}
