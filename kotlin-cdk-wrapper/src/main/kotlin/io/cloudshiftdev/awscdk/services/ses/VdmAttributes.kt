@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Virtual Deliverablity Manager (VDM) attributes.
 *
 * Example:
 *
 * ```
 * // Enables engagement tracking and optimized shared delivery by default
 * // Enables engagement tracking and optimized shared delivery by default
 * new VdmAttributes(this, "Vdm");
 * ```
 */
public open class VdmAttributes internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.VdmAttributes,
) : Resource(cdkObject), IVdmAttributes {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ses.VdmAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VdmAttributesProps,
  ) :
      this(software.amazon.awscdk.services.ses.VdmAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(VdmAttributesProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VdmAttributesProps.Builder.() -> Unit,
  ) : this(scope, id, VdmAttributesProps(props)
  )

  /**
   * The name of the resource behind the Virtual Deliverablity Manager attributes.
   */
  public override fun vdmAttributesName(): String = unwrap(this).getVdmAttributesName()

  /**
   * Resource ID for the Virtual Deliverablity Manager attributes.
   */
  public open fun vdmAttributesResourceId(): String = unwrap(this).getVdmAttributesResourceId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.VdmAttributes].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether engagement metrics are enabled for your account.
     *
     * Default: true
     *
     * @param engagementMetrics Whether engagement metrics are enabled for your account. 
     */
    public fun engagementMetrics(engagementMetrics: Boolean)

    /**
     * Whether optimized shared delivery is enabled for your account.
     *
     * Default: true
     *
     * @param optimizedSharedDelivery Whether optimized shared delivery is enabled for your account.
     * 
     */
    public fun optimizedSharedDelivery(optimizedSharedDelivery: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.VdmAttributes.Builder =
        software.amazon.awscdk.services.ses.VdmAttributes.Builder.create(scope, id)

    /**
     * Whether engagement metrics are enabled for your account.
     *
     * Default: true
     *
     * @param engagementMetrics Whether engagement metrics are enabled for your account. 
     */
    override fun engagementMetrics(engagementMetrics: Boolean) {
      cdkBuilder.engagementMetrics(engagementMetrics)
    }

    /**
     * Whether optimized shared delivery is enabled for your account.
     *
     * Default: true
     *
     * @param optimizedSharedDelivery Whether optimized shared delivery is enabled for your account.
     * 
     */
    override fun optimizedSharedDelivery(optimizedSharedDelivery: Boolean) {
      cdkBuilder.optimizedSharedDelivery(optimizedSharedDelivery)
    }

    public fun build(): software.amazon.awscdk.services.ses.VdmAttributes = cdkBuilder.build()
  }

  public companion object {
    public fun fromVdmAttributesName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      vdmAttributesName: String,
    ): IVdmAttributes =
        software.amazon.awscdk.services.ses.VdmAttributes.fromVdmAttributesName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, vdmAttributesName).let(IVdmAttributes::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): VdmAttributes {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return VdmAttributes(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.VdmAttributes): VdmAttributes =
        VdmAttributes(cdkObject)

    internal fun unwrap(wrapped: VdmAttributes): software.amazon.awscdk.services.ses.VdmAttributes =
        wrapped.cdkObject
  }
}
