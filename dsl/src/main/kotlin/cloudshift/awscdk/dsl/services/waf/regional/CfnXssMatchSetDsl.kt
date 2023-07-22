@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnXssMatchSet
import software.constructs.Construct

@CdkDslMarker
public class CfnXssMatchSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnXssMatchSet.Builder = CfnXssMatchSet.Builder.create(scope, id)

  private val _xssMatchTuples: MutableList<Any> = mutableListOf()

  /**
   * The name, if any, of the `XssMatchSet` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html#cfn-wafregional-xssmatchset-name)
   * @param name The name, if any, of the `XssMatchSet` . 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html#cfn-wafregional-xssmatchset-xssmatchtuples)
   * @param xssMatchTuples Specifies the parts of web requests that you want to inspect for
   * cross-site scripting attacks. 
   */
  public fun xssMatchTuples(vararg xssMatchTuples: Any) {
    _xssMatchTuples.addAll(listOf(*xssMatchTuples))
  }

  /**
   * Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html#cfn-wafregional-xssmatchset-xssmatchtuples)
   * @param xssMatchTuples Specifies the parts of web requests that you want to inspect for
   * cross-site scripting attacks. 
   */
  public fun xssMatchTuples(xssMatchTuples: Collection<Any>) {
    _xssMatchTuples.addAll(xssMatchTuples)
  }

  /**
   * Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html#cfn-wafregional-xssmatchset-xssmatchtuples)
   * @param xssMatchTuples Specifies the parts of web requests that you want to inspect for
   * cross-site scripting attacks. 
   */
  public fun xssMatchTuples(xssMatchTuples: IResolvable) {
    cdkBuilder.xssMatchTuples(xssMatchTuples)
  }

  public fun build(): CfnXssMatchSet {
    if(_xssMatchTuples.isNotEmpty()) cdkBuilder.xssMatchTuples(_xssMatchTuples)
    return cdkBuilder.build()
  }
}
