@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnByteMatchSet
import software.constructs.Construct

@CdkDslMarker
public class CfnByteMatchSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnByteMatchSet.Builder = CfnByteMatchSet.Builder.create(scope, id)

  private val _byteMatchTuples: MutableList<Any> = mutableListOf()

  /**
   * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
   * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
   * and other settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-bytematchtuples)
   * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
   * characters) that you want AWS WAF to search for in web requests, the location in requests that you
   * want AWS WAF to search, and other settings. 
   */
  public fun byteMatchTuples(vararg byteMatchTuples: Any) {
    _byteMatchTuples.addAll(listOf(*byteMatchTuples))
  }

  /**
   * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
   * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
   * and other settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-bytematchtuples)
   * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
   * characters) that you want AWS WAF to search for in web requests, the location in requests that you
   * want AWS WAF to search, and other settings. 
   */
  public fun byteMatchTuples(byteMatchTuples: Collection<Any>) {
    _byteMatchTuples.addAll(byteMatchTuples)
  }

  /**
   * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
   * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search,
   * and other settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-bytematchtuples)
   * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
   * characters) that you want AWS WAF to search for in web requests, the location in requests that you
   * want AWS WAF to search, and other settings. 
   */
  public fun byteMatchTuples(byteMatchTuples: IResolvable) {
    cdkBuilder.byteMatchTuples(byteMatchTuples)
  }

  /**
   * The name of the `ByteMatchSet` .
   *
   * You can't change `Name` after you create a `ByteMatchSet` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-bytematchset.html#cfn-waf-bytematchset-name)
   * @param name The name of the `ByteMatchSet` . 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnByteMatchSet {
    if(_byteMatchTuples.isNotEmpty()) cdkBuilder.byteMatchTuples(_byteMatchTuples)
    return cdkBuilder.build()
  }
}
