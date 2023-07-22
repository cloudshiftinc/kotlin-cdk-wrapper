@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnInstance

/**
 * Specifies the SSM document and parameter values in AWS Systems Manager to associate with an
 * instance.
 *
 * `SsmAssociations` is a property of the
 * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
 * resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * SsmAssociationProperty ssmAssociationProperty = SsmAssociationProperty.builder()
 * .documentName("documentName")
 * // the properties below are optional
 * .associationParameters(List.of(AssociationParameterProperty.builder()
 * .key("key")
 * .value(List.of("value"))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociation.html)
 */
@CdkDslMarker
public class CfnInstanceSsmAssociationPropertyDsl {
  private val cdkBuilder: CfnInstance.SsmAssociationProperty.Builder =
      CfnInstance.SsmAssociationProperty.builder()

  private val _associationParameters: MutableList<Any> = mutableListOf()

  /**
   * @param associationParameters The input parameter values to use with the associated SSM
   * document.
   */
  public fun associationParameters(vararg associationParameters: Any) {
    _associationParameters.addAll(listOf(*associationParameters))
  }

  /**
   * @param associationParameters The input parameter values to use with the associated SSM
   * document.
   */
  public fun associationParameters(associationParameters: Collection<Any>) {
    _associationParameters.addAll(associationParameters)
  }

  /**
   * @param associationParameters The input parameter values to use with the associated SSM
   * document.
   */
  public fun associationParameters(associationParameters: IResolvable) {
    cdkBuilder.associationParameters(associationParameters)
  }

  /**
   * @param documentName The name of an SSM document to associate with the instance. 
   */
  public fun documentName(documentName: String) {
    cdkBuilder.documentName(documentName)
  }

  public fun build(): CfnInstance.SsmAssociationProperty {
    if(_associationParameters.isNotEmpty()) cdkBuilder.associationParameters(_associationParameters)
    return cdkBuilder.build()
  }
}
