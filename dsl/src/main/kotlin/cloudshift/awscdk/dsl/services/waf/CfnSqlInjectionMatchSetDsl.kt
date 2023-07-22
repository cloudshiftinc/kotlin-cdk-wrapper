@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet
import software.constructs.Construct

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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html#cfn-waf-sqlinjectionmatchset-name)
   * @param name The name, if any, of the `SqlInjectionMatchSet` . 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL
   * code.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sqlinjectionmatchset.html#cfn-waf-sqlinjectionmatchset-sqlinjectionmatchtuples)
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
