@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnMailManagerRelay`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * Object noAuthentication;
 * CfnMailManagerRelayProps cfnMailManagerRelayProps = CfnMailManagerRelayProps.builder()
 * .authentication(RelayAuthenticationProperty.builder()
 * .noAuthentication(noAuthentication)
 * .secretArn("secretArn")
 * .build())
 * .serverName("serverName")
 * .serverPort(123)
 * // the properties below are optional
 * .relayName("relayName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html)
 */
public interface CfnMailManagerRelayProps {
  /**
   * Authentication for the relay destination server—specify the secretARN where the SMTP
   * credentials are stored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-authentication)
   */
  public fun authentication(): Any

  /**
   * The unique relay name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-relayname)
   */
  public fun relayName(): String? = unwrap(this).getRelayName()

  /**
   * The destination relay server address.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-servername)
   */
  public fun serverName(): String

  /**
   * The destination relay server port.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-serverport)
   */
  public fun serverPort(): Number

  /**
   * The tags used to organize, track, or control access for the resource.
   *
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnMailManagerRelayProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authentication Authentication for the relay destination server—specify the secretARN
     * where the SMTP credentials are stored. 
     */
    public fun authentication(authentication: IResolvable)

    /**
     * @param authentication Authentication for the relay destination server—specify the secretARN
     * where the SMTP credentials are stored. 
     */
    public fun authentication(authentication: CfnMailManagerRelay.RelayAuthenticationProperty)

    /**
     * @param authentication Authentication for the relay destination server—specify the secretARN
     * where the SMTP credentials are stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d4b41a371aa606aefe736dfe794f1bfc1e077254247158212e5954bbf55dcf8")
    public
        fun authentication(authentication: CfnMailManagerRelay.RelayAuthenticationProperty.Builder.() -> Unit)

    /**
     * @param relayName The unique relay name.
     */
    public fun relayName(relayName: String)

    /**
     * @param serverName The destination relay server address. 
     */
    public fun serverName(serverName: String)

    /**
     * @param serverPort The destination relay server port. 
     */
    public fun serverPort(serverPort: Number)

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnMailManagerRelayProps.Builder =
        software.amazon.awscdk.services.ses.CfnMailManagerRelayProps.builder()

    /**
     * @param authentication Authentication for the relay destination server—specify the secretARN
     * where the SMTP credentials are stored. 
     */
    override fun authentication(authentication: IResolvable) {
      cdkBuilder.authentication(authentication.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param authentication Authentication for the relay destination server—specify the secretARN
     * where the SMTP credentials are stored. 
     */
    override fun authentication(authentication: CfnMailManagerRelay.RelayAuthenticationProperty) {
      cdkBuilder.authentication(authentication.let(CfnMailManagerRelay.RelayAuthenticationProperty.Companion::unwrap))
    }

    /**
     * @param authentication Authentication for the relay destination server—specify the secretARN
     * where the SMTP credentials are stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d4b41a371aa606aefe736dfe794f1bfc1e077254247158212e5954bbf55dcf8")
    override
        fun authentication(authentication: CfnMailManagerRelay.RelayAuthenticationProperty.Builder.() -> Unit):
        Unit = authentication(CfnMailManagerRelay.RelayAuthenticationProperty(authentication))

    /**
     * @param relayName The unique relay name.
     */
    override fun relayName(relayName: String) {
      cdkBuilder.relayName(relayName)
    }

    /**
     * @param serverName The destination relay server address. 
     */
    override fun serverName(serverName: String) {
      cdkBuilder.serverName(serverName)
    }

    /**
     * @param serverPort The destination relay server port. 
     */
    override fun serverPort(serverPort: Number) {
      cdkBuilder.serverPort(serverPort)
    }

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ses.CfnMailManagerRelayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRelayProps,
  ) : CdkObject(cdkObject),
      CfnMailManagerRelayProps {
    /**
     * Authentication for the relay destination server—specify the secretARN where the SMTP
     * credentials are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-authentication)
     */
    override fun authentication(): Any = unwrap(this).getAuthentication()

    /**
     * The unique relay name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-relayname)
     */
    override fun relayName(): String? = unwrap(this).getRelayName()

    /**
     * The destination relay server address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-servername)
     */
    override fun serverName(): String = unwrap(this).getServerName()

    /**
     * The destination relay server port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-serverport)
     */
    override fun serverPort(): Number = unwrap(this).getServerPort()

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMailManagerRelayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRelayProps):
        CfnMailManagerRelayProps = CdkObjectWrappers.wrap(cdkObject) as? CfnMailManagerRelayProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMailManagerRelayProps):
        software.amazon.awscdk.services.ses.CfnMailManagerRelayProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.CfnMailManagerRelayProps
  }
}
