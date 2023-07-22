@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoveryreadiness

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet

@CdkDslMarker
public class CfnResourceSetResourcePropertyDsl {
  private val cdkBuilder: CfnResourceSet.ResourceProperty.Builder =
      CfnResourceSet.ResourceProperty.builder()

  private val _readinessScopes: MutableList<String> = mutableListOf()

  /**
   * @param componentId The component identifier of the resource, generated when DNS target resource
   * is used.
   */
  public fun componentId(componentId: String) {
    cdkBuilder.componentId(componentId)
  }

  /**
   * @param dnsTargetResource A component for DNS/routing control readiness checks.
   * This is a required setting when `ResourceSet` `ResourceSetType` is set to
   * `AWS::Route53RecoveryReadiness::DNSTargetResource` . Do not set it for any other `ResourceSetType`
   * setting.
   */
  public fun dnsTargetResource(dnsTargetResource: IResolvable) {
    cdkBuilder.dnsTargetResource(dnsTargetResource)
  }

  /**
   * @param dnsTargetResource A component for DNS/routing control readiness checks.
   * This is a required setting when `ResourceSet` `ResourceSetType` is set to
   * `AWS::Route53RecoveryReadiness::DNSTargetResource` . Do not set it for any other `ResourceSetType`
   * setting.
   */
  public fun dnsTargetResource(dnsTargetResource: CfnResourceSet.DNSTargetResourceProperty) {
    cdkBuilder.dnsTargetResource(dnsTargetResource)
  }

  /**
   * @param readinessScopes The recovery group Amazon Resource Name (ARN) or the cell ARN that the
   * readiness checks for this resource set are scoped to.
   */
  public fun readinessScopes(vararg readinessScopes: String) {
    _readinessScopes.addAll(listOf(*readinessScopes))
  }

  /**
   * @param readinessScopes The recovery group Amazon Resource Name (ARN) or the cell ARN that the
   * readiness checks for this resource set are scoped to.
   */
  public fun readinessScopes(readinessScopes: Collection<String>) {
    _readinessScopes.addAll(readinessScopes)
  }

  /**
   * @param resourceArn The Amazon Resource Name (ARN) of the AWS resource.
   * This is a required setting for all `ResourceSet` `ResourceSetType` settings except
   * `AWS::Route53RecoveryReadiness::DNSTargetResource` . Do not set this when `ResourceSetType` is set
   * to `AWS::Route53RecoveryReadiness::DNSTargetResource` .
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnResourceSet.ResourceProperty {
    if(_readinessScopes.isNotEmpty()) cdkBuilder.readinessScopes(_readinessScopes)
    return cdkBuilder.build()
  }
}
