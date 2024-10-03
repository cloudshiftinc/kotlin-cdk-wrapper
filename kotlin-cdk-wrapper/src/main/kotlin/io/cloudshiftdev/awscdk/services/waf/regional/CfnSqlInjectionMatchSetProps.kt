@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSqlInjectionMatchSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.waf.regional.*;
 * CfnSqlInjectionMatchSetProps cfnSqlInjectionMatchSetProps =
 * CfnSqlInjectionMatchSetProps.builder()
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
public interface CfnSqlInjectionMatchSetProps {
  /**
   * The name, if any, of the `SqlInjectionMatchSet` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-name)
   */
  public fun name(): String

  /**
   * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL
   * code.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuples)
   */
  public fun sqlInjectionMatchTuples(): Any? = unwrap(this).getSqlInjectionMatchTuples()

  /**
   * A builder for [CfnSqlInjectionMatchSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name, if any, of the `SqlInjectionMatchSet` . 
     */
    public fun name(name: String)

    /**
     * @param sqlInjectionMatchTuples Specifies the parts of web requests that you want to inspect
     * for snippets of malicious SQL code.
     */
    public fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: IResolvable)

    /**
     * @param sqlInjectionMatchTuples Specifies the parts of web requests that you want to inspect
     * for snippets of malicious SQL code.
     */
    public fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: List<Any>)

    /**
     * @param sqlInjectionMatchTuples Specifies the parts of web requests that you want to inspect
     * for snippets of malicious SQL code.
     */
    public fun sqlInjectionMatchTuples(vararg sqlInjectionMatchTuples: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps.Builder =
        software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps.builder()

    /**
     * @param name The name, if any, of the `SqlInjectionMatchSet` . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param sqlInjectionMatchTuples Specifies the parts of web requests that you want to inspect
     * for snippets of malicious SQL code.
     */
    override fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: IResolvable) {
      cdkBuilder.sqlInjectionMatchTuples(sqlInjectionMatchTuples.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sqlInjectionMatchTuples Specifies the parts of web requests that you want to inspect
     * for snippets of malicious SQL code.
     */
    override fun sqlInjectionMatchTuples(sqlInjectionMatchTuples: List<Any>) {
      cdkBuilder.sqlInjectionMatchTuples(sqlInjectionMatchTuples.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param sqlInjectionMatchTuples Specifies the parts of web requests that you want to inspect
     * for snippets of malicious SQL code.
     */
    override fun sqlInjectionMatchTuples(vararg sqlInjectionMatchTuples: Any): Unit =
        sqlInjectionMatchTuples(sqlInjectionMatchTuples.toList())

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps,
  ) : CdkObject(cdkObject),
      CfnSqlInjectionMatchSetProps {
    /**
     * The name, if any, of the `SqlInjectionMatchSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL
     * code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sqlinjectionmatchset.html#cfn-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuples)
     */
    override fun sqlInjectionMatchTuples(): Any? = unwrap(this).getSqlInjectionMatchTuples()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSqlInjectionMatchSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps):
        CfnSqlInjectionMatchSetProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnSqlInjectionMatchSetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSqlInjectionMatchSetProps):
        software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps
  }
}
