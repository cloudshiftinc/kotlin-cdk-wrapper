@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Route53::DNSSEC` resource is used to enable DNSSEC signing in a hosted zone.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * CfnDNSSEC cfnDNSSEC = CfnDNSSEC.Builder.create(this, "MyCfnDNSSEC")
 * .hostedZoneId("hostedZoneId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-dnssec.html)
 */
public open class CfnDNSSEC(
  cdkObject: software.amazon.awscdk.services.route53.CfnDNSSEC,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDNSSECProps,
  ) :
      this(software.amazon.awscdk.services.route53.CfnDNSSEC(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDNSSECProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDNSSECProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDNSSECProps(props)
  )

  /**
   * A unique string (ID) that is used to identify a hosted zone.
   */
  public open fun hostedZoneId(): String = unwrap(this).getHostedZoneId()

  /**
   * A unique string (ID) that is used to identify a hosted zone.
   */
  public open fun hostedZoneId(`value`: String) {
    unwrap(this).setHostedZoneId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53.CfnDNSSEC].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A unique string (ID) that is used to identify a hosted zone.
     *
     * For example: `Z00001111A1ABCaaABC11` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-dnssec.html#cfn-route53-dnssec-hostedzoneid)
     * @param hostedZoneId A unique string (ID) that is used to identify a hosted zone. 
     */
    public fun hostedZoneId(hostedZoneId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnDNSSEC.Builder =
        software.amazon.awscdk.services.route53.CfnDNSSEC.Builder.create(scope, id)

    /**
     * A unique string (ID) that is used to identify a hosted zone.
     *
     * For example: `Z00001111A1ABCaaABC11` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-dnssec.html#cfn-route53-dnssec-hostedzoneid)
     * @param hostedZoneId A unique string (ID) that is used to identify a hosted zone. 
     */
    override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public fun build(): software.amazon.awscdk.services.route53.CfnDNSSEC = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53.CfnDNSSEC.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDNSSEC {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDNSSEC(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnDNSSEC): CfnDNSSEC =
        CfnDNSSEC(cdkObject)

    internal fun unwrap(wrapped: CfnDNSSEC): software.amazon.awscdk.services.route53.CfnDNSSEC =
        wrapped.cdkObject as software.amazon.awscdk.services.route53.CfnDNSSEC
  }
}
