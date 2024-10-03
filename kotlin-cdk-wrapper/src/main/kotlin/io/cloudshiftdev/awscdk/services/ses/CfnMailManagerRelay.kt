@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Resource to create an SMTP relay, which can be used within a Mail Manager rule set to forward
 * incoming emails to defined relay destinations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * Object noAuthentication;
 * CfnMailManagerRelay cfnMailManagerRelay = CfnMailManagerRelay.Builder.create(this,
 * "MyCfnMailManagerRelay")
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
public open class CfnMailManagerRelay(
  cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRelay,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMailManagerRelayProps,
  ) :
      this(software.amazon.awscdk.services.ses.CfnMailManagerRelay(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMailManagerRelayProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMailManagerRelayProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMailManagerRelayProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the relay.
   */
  public open fun attrRelayArn(): String = unwrap(this).getAttrRelayArn()

  /**
   * The unique relay identifier.
   */
  public open fun attrRelayId(): String = unwrap(this).getAttrRelayId()

  /**
   * Authentication for the relay destination server—specify the secretARN where the SMTP
   * credentials are stored.
   */
  public open fun authentication(): Any = unwrap(this).getAuthentication()

  /**
   * Authentication for the relay destination server—specify the secretARN where the SMTP
   * credentials are stored.
   */
  public open fun authentication(`value`: IResolvable) {
    unwrap(this).setAuthentication(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Authentication for the relay destination server—specify the secretARN where the SMTP
   * credentials are stored.
   */
  public open fun authentication(`value`: RelayAuthenticationProperty) {
    unwrap(this).setAuthentication(`value`.let(RelayAuthenticationProperty.Companion::unwrap))
  }

  /**
   * Authentication for the relay destination server—specify the secretARN where the SMTP
   * credentials are stored.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("967cf8f8eab4d676e65b5062b005e5e31812acdf26ae72e04cdef6ad51902b1b")
  public open fun authentication(`value`: RelayAuthenticationProperty.Builder.() -> Unit): Unit =
      authentication(RelayAuthenticationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The unique relay name.
   */
  public open fun relayName(): String? = unwrap(this).getRelayName()

  /**
   * The unique relay name.
   */
  public open fun relayName(`value`: String) {
    unwrap(this).setRelayName(`value`)
  }

  /**
   * The destination relay server address.
   */
  public open fun serverName(): String = unwrap(this).getServerName()

  /**
   * The destination relay server address.
   */
  public open fun serverName(`value`: String) {
    unwrap(this).setServerName(`value`)
  }

  /**
   * The destination relay server port.
   */
  public open fun serverPort(): Number = unwrap(this).getServerPort()

  /**
   * The destination relay server port.
   */
  public open fun serverPort(`value`: Number) {
    unwrap(this).setServerPort(`value`)
  }

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.CfnMailManagerRelay].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Authentication for the relay destination server—specify the secretARN where the SMTP
     * credentials are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-authentication)
     * @param authentication Authentication for the relay destination server—specify the secretARN
     * where the SMTP credentials are stored. 
     */
    public fun authentication(authentication: IResolvable)

    /**
     * Authentication for the relay destination server—specify the secretARN where the SMTP
     * credentials are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-authentication)
     * @param authentication Authentication for the relay destination server—specify the secretARN
     * where the SMTP credentials are stored. 
     */
    public fun authentication(authentication: RelayAuthenticationProperty)

    /**
     * Authentication for the relay destination server—specify the secretARN where the SMTP
     * credentials are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-authentication)
     * @param authentication Authentication for the relay destination server—specify the secretARN
     * where the SMTP credentials are stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cab0a877c372608ed04572d0a01d2fe01951651ca496ce18faecdd86d155aff")
    public fun authentication(authentication: RelayAuthenticationProperty.Builder.() -> Unit)

    /**
     * The unique relay name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-relayname)
     * @param relayName The unique relay name. 
     */
    public fun relayName(relayName: String)

    /**
     * The destination relay server address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-servername)
     * @param serverName The destination relay server address. 
     */
    public fun serverName(serverName: String)

    /**
     * The destination relay server port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-serverport)
     * @param serverPort The destination relay server port. 
     */
    public fun serverPort(serverPort: Number)

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnMailManagerRelay.Builder =
        software.amazon.awscdk.services.ses.CfnMailManagerRelay.Builder.create(scope, id)

    /**
     * Authentication for the relay destination server—specify the secretARN where the SMTP
     * credentials are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-authentication)
     * @param authentication Authentication for the relay destination server—specify the secretARN
     * where the SMTP credentials are stored. 
     */
    override fun authentication(authentication: IResolvable) {
      cdkBuilder.authentication(authentication.let(IResolvable.Companion::unwrap))
    }

    /**
     * Authentication for the relay destination server—specify the secretARN where the SMTP
     * credentials are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-authentication)
     * @param authentication Authentication for the relay destination server—specify the secretARN
     * where the SMTP credentials are stored. 
     */
    override fun authentication(authentication: RelayAuthenticationProperty) {
      cdkBuilder.authentication(authentication.let(RelayAuthenticationProperty.Companion::unwrap))
    }

    /**
     * Authentication for the relay destination server—specify the secretARN where the SMTP
     * credentials are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-authentication)
     * @param authentication Authentication for the relay destination server—specify the secretARN
     * where the SMTP credentials are stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cab0a877c372608ed04572d0a01d2fe01951651ca496ce18faecdd86d155aff")
    override fun authentication(authentication: RelayAuthenticationProperty.Builder.() -> Unit):
        Unit = authentication(RelayAuthenticationProperty(authentication))

    /**
     * The unique relay name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-relayname)
     * @param relayName The unique relay name. 
     */
    override fun relayName(relayName: String) {
      cdkBuilder.relayName(relayName)
    }

    /**
     * The destination relay server address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-servername)
     * @param serverName The destination relay server address. 
     */
    override fun serverName(serverName: String) {
      cdkBuilder.serverName(serverName)
    }

    /**
     * The destination relay server port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-serverport)
     * @param serverPort The destination relay server port. 
     */
    override fun serverPort(serverPort: Number) {
      cdkBuilder.serverPort(serverPort)
    }

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerrelay.html#cfn-ses-mailmanagerrelay-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ses.CfnMailManagerRelay = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ses.CfnMailManagerRelay.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMailManagerRelay {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMailManagerRelay(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRelay):
        CfnMailManagerRelay = CfnMailManagerRelay(cdkObject)

    internal fun unwrap(wrapped: CfnMailManagerRelay):
        software.amazon.awscdk.services.ses.CfnMailManagerRelay = wrapped.cdkObject as
        software.amazon.awscdk.services.ses.CfnMailManagerRelay
  }

  /**
   * Authentication for the relay destination server—specify the secretARN where the SMTP
   * credentials are stored, or specify an empty NoAuthentication structure if the relay destination
   * server does not require SMTP credential authentication.
   *
   *
   * This data type is a UNION, so only one of the following members can be specified when used or
   * returned.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * Object noAuthentication;
   * RelayAuthenticationProperty relayAuthenticationProperty = RelayAuthenticationProperty.builder()
   * .noAuthentication(noAuthentication)
   * .secretArn("secretArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerrelay-relayauthentication.html)
   */
  public interface RelayAuthenticationProperty {
    /**
     * Keep an empty structure if the relay destination server does not require SMTP credential
     * authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerrelay-relayauthentication.html#cfn-ses-mailmanagerrelay-relayauthentication-noauthentication)
     */
    public fun noAuthentication(): Any? = unwrap(this).getNoAuthentication()

    /**
     * The ARN of the secret created in secrets manager where the relay server's SMTP credentials
     * are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerrelay-relayauthentication.html#cfn-ses-mailmanagerrelay-relayauthentication-secretarn)
     */
    public fun secretArn(): String? = unwrap(this).getSecretArn()

    /**
     * A builder for [RelayAuthenticationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param noAuthentication Keep an empty structure if the relay destination server does not
       * require SMTP credential authentication.
       */
      public fun noAuthentication(noAuthentication: Any)

      /**
       * @param secretArn The ARN of the secret created in secrets manager where the relay server's
       * SMTP credentials are stored.
       */
      public fun secretArn(secretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRelay.RelayAuthenticationProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerRelay.RelayAuthenticationProperty.builder()

      /**
       * @param noAuthentication Keep an empty structure if the relay destination server does not
       * require SMTP credential authentication.
       */
      override fun noAuthentication(noAuthentication: Any) {
        cdkBuilder.noAuthentication(noAuthentication)
      }

      /**
       * @param secretArn The ARN of the secret created in secrets manager where the relay server's
       * SMTP credentials are stored.
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRelay.RelayAuthenticationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRelay.RelayAuthenticationProperty,
    ) : CdkObject(cdkObject),
        RelayAuthenticationProperty {
      /**
       * Keep an empty structure if the relay destination server does not require SMTP credential
       * authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerrelay-relayauthentication.html#cfn-ses-mailmanagerrelay-relayauthentication-noauthentication)
       */
      override fun noAuthentication(): Any? = unwrap(this).getNoAuthentication()

      /**
       * The ARN of the secret created in secrets manager where the relay server's SMTP credentials
       * are stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerrelay-relayauthentication.html#cfn-ses-mailmanagerrelay-relayauthentication-secretarn)
       */
      override fun secretArn(): String? = unwrap(this).getSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RelayAuthenticationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRelay.RelayAuthenticationProperty):
          RelayAuthenticationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RelayAuthenticationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RelayAuthenticationProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRelay.RelayAuthenticationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRelay.RelayAuthenticationProperty
    }
  }
}
