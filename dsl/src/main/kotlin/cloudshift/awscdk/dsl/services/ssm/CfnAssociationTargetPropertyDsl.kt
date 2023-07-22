@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ssm.CfnAssociation

@CdkDslMarker
public class CfnAssociationTargetPropertyDsl {
  private val cdkBuilder: CfnAssociation.TargetProperty.Builder =
      CfnAssociation.TargetProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  /**
   * @param key User-defined criteria for sending commands that target managed nodes that meet the
   * criteria. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param values User-defined criteria that maps to `Key` . 
   * For example, if you specified `tag:ServerRole` , you could specify `value:WebServer` to run a
   * command on instances that include EC2 tags of `ServerRole,WebServer` .
   *
   * Depending on the type of target, the maximum number of values for a key might be lower than the
   * global maximum of 50.
   */
  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values User-defined criteria that maps to `Key` . 
   * For example, if you specified `tag:ServerRole` , you could specify `value:WebServer` to run a
   * command on instances that include EC2 tags of `ServerRole,WebServer` .
   *
   * Depending on the type of target, the maximum number of values for a key might be lower than the
   * global maximum of 50.
   */
  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnAssociation.TargetProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
