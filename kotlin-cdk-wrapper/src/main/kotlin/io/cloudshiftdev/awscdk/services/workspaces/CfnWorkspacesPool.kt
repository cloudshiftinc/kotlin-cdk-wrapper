@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspaces

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
 * Describes a pool of WorkSpaces.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspaces.*;
 * CfnWorkspacesPool cfnWorkspacesPool = CfnWorkspacesPool.Builder.create(this,
 * "MyCfnWorkspacesPool")
 * .bundleId("bundleId")
 * .capacity(CapacityProperty.builder()
 * .desiredUserSessions(123)
 * .build())
 * .directoryId("directoryId")
 * .poolName("poolName")
 * // the properties below are optional
 * .applicationSettings(ApplicationSettingsProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .settingsGroup("settingsGroup")
 * .build())
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .timeoutSettings(TimeoutSettingsProperty.builder()
 * .disconnectTimeoutInSeconds(123)
 * .idleDisconnectTimeoutInSeconds(123)
 * .maxUserDurationInSeconds(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html)
 */
public open class CfnWorkspacesPool(
  cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspacesPool,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkspacesPoolProps,
  ) :
      this(software.amazon.awscdk.services.workspaces.CfnWorkspacesPool(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnWorkspacesPoolProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkspacesPoolProps.Builder.() -> Unit,
  ) : this(scope, id, CfnWorkspacesPoolProps(props)
  )

  /**
   * The persistent application settings for users of the pool.
   */
  public open fun applicationSettings(): Any? = unwrap(this).getApplicationSettings()

  /**
   * The persistent application settings for users of the pool.
   */
  public open fun applicationSettings(`value`: IResolvable) {
    unwrap(this).setApplicationSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The persistent application settings for users of the pool.
   */
  public open fun applicationSettings(`value`: ApplicationSettingsProperty) {
    unwrap(this).setApplicationSettings(`value`.let(ApplicationSettingsProperty.Companion::unwrap))
  }

  /**
   * The persistent application settings for users of the pool.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("70bcd7a35d0d19bf6219cf8476c96c607f5fba84c37cdeabb9518c2ceb43ebc5")
  public open fun applicationSettings(`value`: ApplicationSettingsProperty.Builder.() -> Unit): Unit
      = applicationSettings(ApplicationSettingsProperty(`value`))

  /**
   * The time the pool was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Amazon Resource Name (ARN) for the pool.
   */
  public open fun attrPoolArn(): String = unwrap(this).getAttrPoolArn()

  /**
   * The identifier of the pool.
   */
  public open fun attrPoolId(): String = unwrap(this).getAttrPoolId()

  /**
   * The identifier of the bundle used by the pool.
   */
  public open fun bundleId(): String = unwrap(this).getBundleId()

  /**
   * The identifier of the bundle used by the pool.
   */
  public open fun bundleId(`value`: String) {
    unwrap(this).setBundleId(`value`)
  }

  /**
   * Describes the user capacity for the pool.
   */
  public open fun capacity(): Any = unwrap(this).getCapacity()

  /**
   * Describes the user capacity for the pool.
   */
  public open fun capacity(`value`: IResolvable) {
    unwrap(this).setCapacity(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Describes the user capacity for the pool.
   */
  public open fun capacity(`value`: CapacityProperty) {
    unwrap(this).setCapacity(`value`.let(CapacityProperty.Companion::unwrap))
  }

  /**
   * Describes the user capacity for the pool.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8723913a43a5a6b1b218ec8e949254dbcc5c259e6366fabe63c74021d081d302")
  public open fun capacity(`value`: CapacityProperty.Builder.() -> Unit): Unit =
      capacity(CapacityProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the pool.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the pool.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The identifier of the directory used by the pool.
   */
  public open fun directoryId(): String = unwrap(this).getDirectoryId()

  /**
   * The identifier of the directory used by the pool.
   */
  public open fun directoryId(`value`: String) {
    unwrap(this).setDirectoryId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the pool.
   */
  public open fun poolName(): String = unwrap(this).getPoolName()

  /**
   * The name of the pool.
   */
  public open fun poolName(`value`: String) {
    unwrap(this).setPoolName(`value`)
  }

  /**
   * The tags for the pool.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags for the pool.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags for the pool.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The amount of time that a pool session remains active after users disconnect.
   */
  public open fun timeoutSettings(): Any? = unwrap(this).getTimeoutSettings()

  /**
   * The amount of time that a pool session remains active after users disconnect.
   */
  public open fun timeoutSettings(`value`: IResolvable) {
    unwrap(this).setTimeoutSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The amount of time that a pool session remains active after users disconnect.
   */
  public open fun timeoutSettings(`value`: TimeoutSettingsProperty) {
    unwrap(this).setTimeoutSettings(`value`.let(TimeoutSettingsProperty.Companion::unwrap))
  }

  /**
   * The amount of time that a pool session remains active after users disconnect.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6de7b7d3d0eddcf2643a58d20797fb126a118452228f61fe5376df3e06028442")
  public open fun timeoutSettings(`value`: TimeoutSettingsProperty.Builder.() -> Unit): Unit =
      timeoutSettings(TimeoutSettingsProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.workspaces.CfnWorkspacesPool].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The persistent application settings for users of the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-applicationsettings)
     * @param applicationSettings The persistent application settings for users of the pool. 
     */
    public fun applicationSettings(applicationSettings: IResolvable)

    /**
     * The persistent application settings for users of the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-applicationsettings)
     * @param applicationSettings The persistent application settings for users of the pool. 
     */
    public fun applicationSettings(applicationSettings: ApplicationSettingsProperty)

    /**
     * The persistent application settings for users of the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-applicationsettings)
     * @param applicationSettings The persistent application settings for users of the pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d368b51ce418a152311a943f4d41778a94cab4da581e763886db2b51945bb97e")
    public
        fun applicationSettings(applicationSettings: ApplicationSettingsProperty.Builder.() -> Unit)

    /**
     * The identifier of the bundle used by the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-bundleid)
     * @param bundleId The identifier of the bundle used by the pool. 
     */
    public fun bundleId(bundleId: String)

    /**
     * Describes the user capacity for the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-capacity)
     * @param capacity Describes the user capacity for the pool. 
     */
    public fun capacity(capacity: IResolvable)

    /**
     * Describes the user capacity for the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-capacity)
     * @param capacity Describes the user capacity for the pool. 
     */
    public fun capacity(capacity: CapacityProperty)

    /**
     * Describes the user capacity for the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-capacity)
     * @param capacity Describes the user capacity for the pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5a5c9a8e45218383a14147e9ac92d6346a91ed28899b28627e37917e2065d889")
    public fun capacity(capacity: CapacityProperty.Builder.() -> Unit)

    /**
     * The description of the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-description)
     * @param description The description of the pool. 
     */
    public fun description(description: String)

    /**
     * The identifier of the directory used by the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-directoryid)
     * @param directoryId The identifier of the directory used by the pool. 
     */
    public fun directoryId(directoryId: String)

    /**
     * The name of the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-poolname)
     * @param poolName The name of the pool. 
     */
    public fun poolName(poolName: String)

    /**
     * The tags for the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-tags)
     * @param tags The tags for the pool. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-tags)
     * @param tags The tags for the pool. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The amount of time that a pool session remains active after users disconnect.
     *
     * If they try to reconnect to the pool session after a disconnection or network interruption
     * within this time interval, they are connected to their previous session. Otherwise, they are
     * connected to a new session with a new pool instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-timeoutsettings)
     * @param timeoutSettings The amount of time that a pool session remains active after users
     * disconnect. 
     */
    public fun timeoutSettings(timeoutSettings: IResolvable)

    /**
     * The amount of time that a pool session remains active after users disconnect.
     *
     * If they try to reconnect to the pool session after a disconnection or network interruption
     * within this time interval, they are connected to their previous session. Otherwise, they are
     * connected to a new session with a new pool instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-timeoutsettings)
     * @param timeoutSettings The amount of time that a pool session remains active after users
     * disconnect. 
     */
    public fun timeoutSettings(timeoutSettings: TimeoutSettingsProperty)

    /**
     * The amount of time that a pool session remains active after users disconnect.
     *
     * If they try to reconnect to the pool session after a disconnection or network interruption
     * within this time interval, they are connected to their previous session. Otherwise, they are
     * connected to a new session with a new pool instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-timeoutsettings)
     * @param timeoutSettings The amount of time that a pool session remains active after users
     * disconnect. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("247689929422dda2f4bfa88de1805b68a77e5654b60597ed14ac50388eceb73e")
    public fun timeoutSettings(timeoutSettings: TimeoutSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.Builder =
        software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.Builder.create(scope, id)

    /**
     * The persistent application settings for users of the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-applicationsettings)
     * @param applicationSettings The persistent application settings for users of the pool. 
     */
    override fun applicationSettings(applicationSettings: IResolvable) {
      cdkBuilder.applicationSettings(applicationSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * The persistent application settings for users of the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-applicationsettings)
     * @param applicationSettings The persistent application settings for users of the pool. 
     */
    override fun applicationSettings(applicationSettings: ApplicationSettingsProperty) {
      cdkBuilder.applicationSettings(applicationSettings.let(ApplicationSettingsProperty.Companion::unwrap))
    }

    /**
     * The persistent application settings for users of the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-applicationsettings)
     * @param applicationSettings The persistent application settings for users of the pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d368b51ce418a152311a943f4d41778a94cab4da581e763886db2b51945bb97e")
    override
        fun applicationSettings(applicationSettings: ApplicationSettingsProperty.Builder.() -> Unit):
        Unit = applicationSettings(ApplicationSettingsProperty(applicationSettings))

    /**
     * The identifier of the bundle used by the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-bundleid)
     * @param bundleId The identifier of the bundle used by the pool. 
     */
    override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    /**
     * Describes the user capacity for the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-capacity)
     * @param capacity Describes the user capacity for the pool. 
     */
    override fun capacity(capacity: IResolvable) {
      cdkBuilder.capacity(capacity.let(IResolvable.Companion::unwrap))
    }

    /**
     * Describes the user capacity for the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-capacity)
     * @param capacity Describes the user capacity for the pool. 
     */
    override fun capacity(capacity: CapacityProperty) {
      cdkBuilder.capacity(capacity.let(CapacityProperty.Companion::unwrap))
    }

    /**
     * Describes the user capacity for the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-capacity)
     * @param capacity Describes the user capacity for the pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5a5c9a8e45218383a14147e9ac92d6346a91ed28899b28627e37917e2065d889")
    override fun capacity(capacity: CapacityProperty.Builder.() -> Unit): Unit =
        capacity(CapacityProperty(capacity))

    /**
     * The description of the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-description)
     * @param description The description of the pool. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The identifier of the directory used by the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-directoryid)
     * @param directoryId The identifier of the directory used by the pool. 
     */
    override fun directoryId(directoryId: String) {
      cdkBuilder.directoryId(directoryId)
    }

    /**
     * The name of the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-poolname)
     * @param poolName The name of the pool. 
     */
    override fun poolName(poolName: String) {
      cdkBuilder.poolName(poolName)
    }

    /**
     * The tags for the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-tags)
     * @param tags The tags for the pool. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags for the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-tags)
     * @param tags The tags for the pool. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The amount of time that a pool session remains active after users disconnect.
     *
     * If they try to reconnect to the pool session after a disconnection or network interruption
     * within this time interval, they are connected to their previous session. Otherwise, they are
     * connected to a new session with a new pool instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-timeoutsettings)
     * @param timeoutSettings The amount of time that a pool session remains active after users
     * disconnect. 
     */
    override fun timeoutSettings(timeoutSettings: IResolvable) {
      cdkBuilder.timeoutSettings(timeoutSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * The amount of time that a pool session remains active after users disconnect.
     *
     * If they try to reconnect to the pool session after a disconnection or network interruption
     * within this time interval, they are connected to their previous session. Otherwise, they are
     * connected to a new session with a new pool instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-timeoutsettings)
     * @param timeoutSettings The amount of time that a pool session remains active after users
     * disconnect. 
     */
    override fun timeoutSettings(timeoutSettings: TimeoutSettingsProperty) {
      cdkBuilder.timeoutSettings(timeoutSettings.let(TimeoutSettingsProperty.Companion::unwrap))
    }

    /**
     * The amount of time that a pool session remains active after users disconnect.
     *
     * If they try to reconnect to the pool session after a disconnection or network interruption
     * within this time interval, they are connected to their previous session. Otherwise, they are
     * connected to a new session with a new pool instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-timeoutsettings)
     * @param timeoutSettings The amount of time that a pool session remains active after users
     * disconnect. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("247689929422dda2f4bfa88de1805b68a77e5654b60597ed14ac50388eceb73e")
    override fun timeoutSettings(timeoutSettings: TimeoutSettingsProperty.Builder.() -> Unit): Unit
        = timeoutSettings(TimeoutSettingsProperty(timeoutSettings))

    public fun build(): software.amazon.awscdk.services.workspaces.CfnWorkspacesPool =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkspacesPool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkspacesPool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspacesPool):
        CfnWorkspacesPool = CfnWorkspacesPool(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspacesPool):
        software.amazon.awscdk.services.workspaces.CfnWorkspacesPool = wrapped.cdkObject as
        software.amazon.awscdk.services.workspaces.CfnWorkspacesPool
  }

  /**
   * The persistent application settings for users in the pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspaces.*;
   * ApplicationSettingsProperty applicationSettingsProperty = ApplicationSettingsProperty.builder()
   * .status("status")
   * // the properties below are optional
   * .settingsGroup("settingsGroup")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspacespool-applicationsettings.html)
   */
  public interface ApplicationSettingsProperty {
    /**
     * The path prefix for the S3 bucket where users’ persistent application settings are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspacespool-applicationsettings.html#cfn-workspaces-workspacespool-applicationsettings-settingsgroup)
     */
    public fun settingsGroup(): String? = unwrap(this).getSettingsGroup()

    /**
     * Enables or disables persistent application settings for users during their pool sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspacespool-applicationsettings.html#cfn-workspaces-workspacespool-applicationsettings-status)
     */
    public fun status(): String

    /**
     * A builder for [ApplicationSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param settingsGroup The path prefix for the S3 bucket where users’ persistent application
       * settings are stored.
       */
      public fun settingsGroup(settingsGroup: String)

      /**
       * @param status Enables or disables persistent application settings for users during their
       * pool sessions. 
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.ApplicationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.ApplicationSettingsProperty.builder()

      /**
       * @param settingsGroup The path prefix for the S3 bucket where users’ persistent application
       * settings are stored.
       */
      override fun settingsGroup(settingsGroup: String) {
        cdkBuilder.settingsGroup(settingsGroup)
      }

      /**
       * @param status Enables or disables persistent application settings for users during their
       * pool sessions. 
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.ApplicationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.ApplicationSettingsProperty,
    ) : CdkObject(cdkObject),
        ApplicationSettingsProperty {
      /**
       * The path prefix for the S3 bucket where users’ persistent application settings are stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspacespool-applicationsettings.html#cfn-workspaces-workspacespool-applicationsettings-settingsgroup)
       */
      override fun settingsGroup(): String? = unwrap(this).getSettingsGroup()

      /**
       * Enables or disables persistent application settings for users during their pool sessions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspacespool-applicationsettings.html#cfn-workspaces-workspacespool-applicationsettings-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.ApplicationSettingsProperty):
          ApplicationSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ApplicationSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationSettingsProperty):
          software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.ApplicationSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.ApplicationSettingsProperty
    }
  }

  /**
   * Describes the user capacity for the pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspaces.*;
   * CapacityProperty capacityProperty = CapacityProperty.builder()
   * .desiredUserSessions(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspacespool-capacity.html)
   */
  public interface CapacityProperty {
    /**
     * The desired number of user sessions for the WorkSpaces in the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspacespool-capacity.html#cfn-workspaces-workspacespool-capacity-desiredusersessions)
     */
    public fun desiredUserSessions(): Number

    /**
     * A builder for [CapacityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param desiredUserSessions The desired number of user sessions for the WorkSpaces in the
       * pool. 
       */
      public fun desiredUserSessions(desiredUserSessions: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.CapacityProperty.Builder =
          software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.CapacityProperty.builder()

      /**
       * @param desiredUserSessions The desired number of user sessions for the WorkSpaces in the
       * pool. 
       */
      override fun desiredUserSessions(desiredUserSessions: Number) {
        cdkBuilder.desiredUserSessions(desiredUserSessions)
      }

      public fun build():
          software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.CapacityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.CapacityProperty,
    ) : CdkObject(cdkObject),
        CapacityProperty {
      /**
       * The desired number of user sessions for the WorkSpaces in the pool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspacespool-capacity.html#cfn-workspaces-workspacespool-capacity-desiredusersessions)
       */
      override fun desiredUserSessions(): Number = unwrap(this).getDesiredUserSessions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CapacityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.CapacityProperty):
          CapacityProperty = CdkObjectWrappers.wrap(cdkObject) as? CapacityProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityProperty):
          software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.CapacityProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.CapacityProperty
    }
  }

  /**
   * Describes the timeout settings for the pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspaces.*;
   * TimeoutSettingsProperty timeoutSettingsProperty = TimeoutSettingsProperty.builder()
   * .disconnectTimeoutInSeconds(123)
   * .idleDisconnectTimeoutInSeconds(123)
   * .maxUserDurationInSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspacespool-timeoutsettings.html)
   */
  public interface TimeoutSettingsProperty {
    /**
     * Specifies the amount of time, in seconds, that a streaming session remains active after users
     * disconnect.
     *
     * If users try to reconnect to the streaming session after a disconnection or network
     * interruption within the time set, they are connected to their previous session. Otherwise, they
     * are connected to a new session with a new streaming instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspacespool-timeoutsettings.html#cfn-workspaces-workspacespool-timeoutsettings-disconnecttimeoutinseconds)
     */
    public fun disconnectTimeoutInSeconds(): Number? = unwrap(this).getDisconnectTimeoutInSeconds()

    /**
     * The amount of time in seconds a connection will stay active while idle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspacespool-timeoutsettings.html#cfn-workspaces-workspacespool-timeoutsettings-idledisconnecttimeoutinseconds)
     */
    public fun idleDisconnectTimeoutInSeconds(): Number? =
        unwrap(this).getIdleDisconnectTimeoutInSeconds()

    /**
     * Specifies the maximum amount of time, in seconds, that a streaming session can remain active.
     *
     * If users are still connected to a streaming instance five minutes before this limit is
     * reached, they are prompted to save any open documents before being disconnected. After this time
     * elapses, the instance is terminated and replaced by a new instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspacespool-timeoutsettings.html#cfn-workspaces-workspacespool-timeoutsettings-maxuserdurationinseconds)
     */
    public fun maxUserDurationInSeconds(): Number? = unwrap(this).getMaxUserDurationInSeconds()

    /**
     * A builder for [TimeoutSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param disconnectTimeoutInSeconds Specifies the amount of time, in seconds, that a
       * streaming session remains active after users disconnect.
       * If users try to reconnect to the streaming session after a disconnection or network
       * interruption within the time set, they are connected to their previous session. Otherwise,
       * they are connected to a new session with a new streaming instance.
       */
      public fun disconnectTimeoutInSeconds(disconnectTimeoutInSeconds: Number)

      /**
       * @param idleDisconnectTimeoutInSeconds The amount of time in seconds a connection will stay
       * active while idle.
       */
      public fun idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds: Number)

      /**
       * @param maxUserDurationInSeconds Specifies the maximum amount of time, in seconds, that a
       * streaming session can remain active.
       * If users are still connected to a streaming instance five minutes before this limit is
       * reached, they are prompted to save any open documents before being disconnected. After this
       * time elapses, the instance is terminated and replaced by a new instance.
       */
      public fun maxUserDurationInSeconds(maxUserDurationInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.TimeoutSettingsProperty.Builder
          =
          software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.TimeoutSettingsProperty.builder()

      /**
       * @param disconnectTimeoutInSeconds Specifies the amount of time, in seconds, that a
       * streaming session remains active after users disconnect.
       * If users try to reconnect to the streaming session after a disconnection or network
       * interruption within the time set, they are connected to their previous session. Otherwise,
       * they are connected to a new session with a new streaming instance.
       */
      override fun disconnectTimeoutInSeconds(disconnectTimeoutInSeconds: Number) {
        cdkBuilder.disconnectTimeoutInSeconds(disconnectTimeoutInSeconds)
      }

      /**
       * @param idleDisconnectTimeoutInSeconds The amount of time in seconds a connection will stay
       * active while idle.
       */
      override fun idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds: Number) {
        cdkBuilder.idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds)
      }

      /**
       * @param maxUserDurationInSeconds Specifies the maximum amount of time, in seconds, that a
       * streaming session can remain active.
       * If users are still connected to a streaming instance five minutes before this limit is
       * reached, they are prompted to save any open documents before being disconnected. After this
       * time elapses, the instance is terminated and replaced by a new instance.
       */
      override fun maxUserDurationInSeconds(maxUserDurationInSeconds: Number) {
        cdkBuilder.maxUserDurationInSeconds(maxUserDurationInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.TimeoutSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.TimeoutSettingsProperty,
    ) : CdkObject(cdkObject),
        TimeoutSettingsProperty {
      /**
       * Specifies the amount of time, in seconds, that a streaming session remains active after
       * users disconnect.
       *
       * If users try to reconnect to the streaming session after a disconnection or network
       * interruption within the time set, they are connected to their previous session. Otherwise,
       * they are connected to a new session with a new streaming instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspacespool-timeoutsettings.html#cfn-workspaces-workspacespool-timeoutsettings-disconnecttimeoutinseconds)
       */
      override fun disconnectTimeoutInSeconds(): Number? =
          unwrap(this).getDisconnectTimeoutInSeconds()

      /**
       * The amount of time in seconds a connection will stay active while idle.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspacespool-timeoutsettings.html#cfn-workspaces-workspacespool-timeoutsettings-idledisconnecttimeoutinseconds)
       */
      override fun idleDisconnectTimeoutInSeconds(): Number? =
          unwrap(this).getIdleDisconnectTimeoutInSeconds()

      /**
       * Specifies the maximum amount of time, in seconds, that a streaming session can remain
       * active.
       *
       * If users are still connected to a streaming instance five minutes before this limit is
       * reached, they are prompted to save any open documents before being disconnected. After this
       * time elapses, the instance is terminated and replaced by a new instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-workspacespool-timeoutsettings.html#cfn-workspaces-workspacespool-timeoutsettings-maxuserdurationinseconds)
       */
      override fun maxUserDurationInSeconds(): Number? = unwrap(this).getMaxUserDurationInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimeoutSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.TimeoutSettingsProperty):
          TimeoutSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? TimeoutSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeoutSettingsProperty):
          software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.TimeoutSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspaces.CfnWorkspacesPool.TimeoutSettingsProperty
    }
  }
}
