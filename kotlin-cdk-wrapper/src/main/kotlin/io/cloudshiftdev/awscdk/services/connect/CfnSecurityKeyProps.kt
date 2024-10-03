@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSecurityKey`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnSecurityKeyProps cfnSecurityKeyProps = CfnSecurityKeyProps.builder()
 * .instanceId("instanceId")
 * .key("key")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securitykey.html)
 */
public interface CfnSecurityKeyProps {
  /**
   * The Amazon Resource Name (ARN) of the instance.
   *
   * *Minimum* : `1`
   *
   * *Maximum* : `100`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securitykey.html#cfn-connect-securitykey-instanceid)
   */
  public fun instanceId(): String

  /**
   * A valid security key in PEM format. For example:.
   *
   * `"-----BEGIN PUBLIC KEY-----\ [a lot of characters] ----END PUBLIC KEY-----"`
   *
   * *Minimum* : `1`
   *
   * *Maximum* : `1024`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securitykey.html#cfn-connect-securitykey-key)
   */
  public fun key(): String

  /**
   * A builder for [CfnSecurityKeyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instanceId The Amazon Resource Name (ARN) of the instance. 
     * *Minimum* : `1`
     *
     * *Maximum* : `100`
     */
    public fun instanceId(instanceId: String)

    /**
     * @param key A valid security key in PEM format. For example:. 
     * `"-----BEGIN PUBLIC KEY-----\ [a lot of characters] ----END PUBLIC KEY-----"`
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `1024`
     */
    public fun key(key: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnSecurityKeyProps.Builder =
        software.amazon.awscdk.services.connect.CfnSecurityKeyProps.builder()

    /**
     * @param instanceId The Amazon Resource Name (ARN) of the instance. 
     * *Minimum* : `1`
     *
     * *Maximum* : `100`
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * @param key A valid security key in PEM format. For example:. 
     * `"-----BEGIN PUBLIC KEY-----\ [a lot of characters] ----END PUBLIC KEY-----"`
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `1024`
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnSecurityKeyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.connect.CfnSecurityKeyProps,
  ) : CdkObject(cdkObject),
      CfnSecurityKeyProps {
    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securitykey.html#cfn-connect-securitykey-instanceid)
     */
    override fun instanceId(): String = unwrap(this).getInstanceId()

    /**
     * A valid security key in PEM format. For example:.
     *
     * `"-----BEGIN PUBLIC KEY-----\ [a lot of characters] ----END PUBLIC KEY-----"`
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `1024`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securitykey.html#cfn-connect-securitykey-key)
     */
    override fun key(): String = unwrap(this).getKey()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnSecurityKeyProps):
        CfnSecurityKeyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSecurityKeyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityKeyProps):
        software.amazon.awscdk.services.connect.CfnSecurityKeyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnSecurityKeyProps
  }
}
