@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.config.CfnRemediationConfiguration

/**
 * The static value of the resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * StaticValueProperty staticValueProperty = StaticValueProperty.builder()
 * .value(List.of("value"))
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-staticvalue.html)
 */
@CdkDslMarker
public class CfnRemediationConfigurationStaticValuePropertyDsl {
  private val cdkBuilder: CfnRemediationConfiguration.StaticValueProperty.Builder =
      CfnRemediationConfiguration.StaticValueProperty.builder()

  private val _value: MutableList<String> = mutableListOf()

  private val _values: MutableList<String> = mutableListOf()

  /**
   * @param value the value to be set.
   */
  public fun `value`(vararg `value`: String) {
    _value.addAll(listOf(*`value`))
  }

  /**
   * @param value the value to be set.
   */
  public fun `value`(`value`: Collection<String>) {
    _value.addAll(`value`)
  }

  /**
   * @param values A list of values.
   * For example, the ARN of the assumed role.
   */
  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values A list of values.
   * For example, the ARN of the assumed role.
   */
  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnRemediationConfiguration.StaticValueProperty {
    if(_value.isNotEmpty()) cdkBuilder.`value`(_value)
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
