@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.rds.DatabaseProxyAttributes

/**
 * Properties that describe an existing DB Proxy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.rds.*;
 * SecurityGroup securityGroup;
 * DatabaseProxyAttributes databaseProxyAttributes = DatabaseProxyAttributes.builder()
 * .dbProxyArn("dbProxyArn")
 * .dbProxyName("dbProxyName")
 * .endpoint("endpoint")
 * .securityGroups(List.of(securityGroup))
 * .build();
 * ```
 */
@CdkDslMarker
public class DatabaseProxyAttributesDsl {
  private val cdkBuilder: DatabaseProxyAttributes.Builder = DatabaseProxyAttributes.builder()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  /**
   * @param dbProxyArn DB Proxy ARN. 
   */
  public fun dbProxyArn(dbProxyArn: String) {
    cdkBuilder.dbProxyArn(dbProxyArn)
  }

  /**
   * @param dbProxyName DB Proxy Name. 
   */
  public fun dbProxyName(dbProxyName: String) {
    cdkBuilder.dbProxyName(dbProxyName)
  }

  /**
   * @param endpoint Endpoint. 
   */
  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  /**
   * @param securityGroups The security groups of the instance. 
   */
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * @param securityGroups The security groups of the instance. 
   */
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun build(): DatabaseProxyAttributes {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
