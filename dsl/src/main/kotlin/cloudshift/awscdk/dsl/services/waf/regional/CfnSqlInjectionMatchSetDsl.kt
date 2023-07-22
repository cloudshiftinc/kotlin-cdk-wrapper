@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet
import software.constructs.Construct

/**
 * This is *AWS WAF Classic* documentation.
 *
 * For more information, see [AWS WAF
 * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
 * developer guide.
 *
 *
 * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
 * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
 * version, AWS WAF has a single set of endpoints for regional and global use.
 *
 *
 * A complex type that contains `SqlInjectionMatchTuple` objects, which specify the parts of web
 * requests that you want AWS WAF to inspect for snippets of malicious SQL code and, if you want AWS
 * WAF to inspect a header, the name of the header. If a `SqlInjectionMatchSet` contains more than one
 * `SqlInjectionMatchTuple` object, a request needs to include snippets of SQL code in only one of the
 * specified parts of the request to be considered a match.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.regional.*;
 * CfnSqlInjectionMatchSet cfnSqlInjectionMatchSet = CfnSqlInjectionMatchSet.Builder.create(this,
 * "MyCfnSqlInjectionMatchSet")
 * .name("name")
 * // the properties below are optional
 * .sqlInjectionMatchTuples(List.of(SqlInjectionMatchTupleProperty.builder()
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .data("data")
 * .build())
 * .textTransformation("textTransformation")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html)
 */
@CdkDslMarker
public class CfnSqlInjectionMatchSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSqlInjectionMatchSet.Builder =
      CfnSqlInjectionMatchSet.Builder.create(scope, id)

  private val _sqlInjectionMatchTuples: MutableList<Any> = mutableListOf()

  /**
   * The name, if any, of the `SqlInjectionMatchSet` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-name)
   * @param name The name, if any, of the `SqlInjectionMatchSet` . 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL
   * code.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuples)
   * @param sqlInjectionMatchTuples Specifies the parts of web requests that you want to inspect for
   * snippets of malicious SQL code. 
   */
  public fun sqlInjectionMatchTuples(vararg sqlInjectionMatchTuples: Any) {
    _sqlInjectionMatchTuples.addAll(listOf(*sqlInjectionMatchTuples))
  }

  /**
   * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL
   * code.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuples)
   * @param sqlInjectionMatchTuples Specifies the parts of web requests that you want to inspect for
   * snippets of malicious SQL code. 
   */
  public fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: Collection<Any>) {
    _sqlInjectionMatchTuples.addAll(sqlInjectionMatchTuples)
  }

  /**
   * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL
   * code.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuples)
   * @param sqlInjectionMatchTuples Specifies the parts of web requests that you want to inspect for
   * snippets of malicious SQL code. 
   */
  public fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: IResolvable) {
    cdkBuilder.sqlInjectionMatchTuples(sqlInjectionMatchTuples)
  }

  public fun build(): CfnSqlInjectionMatchSet {
    if(_sqlInjectionMatchTuples.isNotEmpty())
        cdkBuilder.sqlInjectionMatchTuples(_sqlInjectionMatchTuples)
    return cdkBuilder.build()
  }
}
