@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Schedule an Amazon Redshift Query to be run, using the Redshift Data API.
 *
 * If you would like Amazon Redshift to identify the Event Bridge rule, and present it in the Amazon
 * Redshift console, append a `QS2-` prefix to both `statementName` and `ruleName`.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.redshiftserverless.*;
 * CfnWorkgroup workgroup;
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.rate(Duration.hours(1)))
 * .build();
 * Queue dlq = new Queue(this, "DeadLetterQueue");
 * rule.addTarget(RedshiftQuery.Builder.create(workgroup.getAttrWorkgroupWorkgroupArn())
 * .database("dev")
 * .deadLetterQueue(dlq)
 * .sql(List.of("SELECT * FROM foo", "SELECT * FROM baz"))
 * .build());
 * ```
 */
public open class RedshiftQuery(
  cdkObject: software.amazon.awscdk.services.events.targets.RedshiftQuery,
) : CdkObject(cdkObject),
    IRuleTarget {
  public constructor(clusterArn: String, props: RedshiftQueryProps) :
      this(software.amazon.awscdk.services.events.targets.RedshiftQuery(clusterArn,
      props.let(RedshiftQueryProps.Companion::unwrap))
  )

  public constructor(clusterArn: String, props: RedshiftQueryProps.Builder.() -> Unit) :
      this(clusterArn, RedshiftQueryProps(props)
  )

  /**
   * Returns the rule target specification.
   *
   * NOTE: Do not use the various `inputXxx` options. They can be set in a call to `addTarget`.
   *
   * @param rule 
   * @param _id
   */
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Returns the rule target specification.
   *
   * NOTE: Do not use the various `inputXxx` options. They can be set in a call to `addTarget`.
   *
   * @param rule 
   * @param _id
   */
  public override fun bind(rule: IRule, id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap), id).let(RuleTargetConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.RedshiftQuery].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Redshift database to run the query against.
     *
     * @param database The Amazon Redshift database to run the query against. 
     */
    public fun database(database: String)

    /**
     * The Amazon Redshift database user to run the query as.
     *
     * This is required when authenticating via temporary credentials.
     *
     * Default: - No Database user is specified
     *
     * @param dbUser The Amazon Redshift database user to run the query as. 
     */
    public fun dbUser(dbUser: String)

    /**
     * The queue to be used as dead letter queue.
     *
     * Default: - No dead letter queue is specified
     *
     * @param deadLetterQueue The queue to be used as dead letter queue. 
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * The input to the state machine execution.
     *
     * Default: - the entire EventBridge event
     *
     * @param input The input to the state machine execution. 
     */
    public fun input(input: RuleTargetInput)

    /**
     * The IAM role to be used to execute the SQL statement.
     *
     * Default: - a new role will be created.
     *
     * @param role The IAM role to be used to execute the SQL statement. 
     */
    public fun role(role: IRole)

    /**
     * The secret containing the password for the database user.
     *
     * This is required when authenticating via Secrets Manager.
     * If the full secret ARN is not specified, this will instead use the secret name.
     *
     * Default: - No secret is specified
     *
     * @param secret The secret containing the password for the database user. 
     */
    public fun secret(secret: ISecret)

    /**
     * Should an event be sent back to Event Bridge when the SQL statement is executed.
     *
     * Default: false
     *
     * @param sendEventBridgeEvent Should an event be sent back to Event Bridge when the SQL
     * statement is executed. 
     */
    public fun sendEventBridgeEvent(sendEventBridgeEvent: Boolean)

    /**
     * The SQL queries to be executed.
     *
     * Each query is run sequentially within a single transaction; the next query in the array will
     * only execute after the previous one has successfully completed.
     *
     * * When multiple sql queries are included, this will use the `batchExecuteStatement` API.
     * Therefore, if any statement fails, the entire transaction is rolled back.
     * * If a single SQL statement is to be executed, this will use the `executeStatement` API.
     *
     * Default: - No SQL query is specified
     *
     * @param sql The SQL queries to be executed. 
     */
    public fun sql(sql: List<String>)

    /**
     * The SQL queries to be executed.
     *
     * Each query is run sequentially within a single transaction; the next query in the array will
     * only execute after the previous one has successfully completed.
     *
     * * When multiple sql queries are included, this will use the `batchExecuteStatement` API.
     * Therefore, if any statement fails, the entire transaction is rolled back.
     * * If a single SQL statement is to be executed, this will use the `executeStatement` API.
     *
     * Default: - No SQL query is specified
     *
     * @param sql The SQL queries to be executed. 
     */
    public fun sql(vararg sql: String)

    /**
     * The name of the SQL statement.
     *
     * You can name the SQL statement for identitfication purposes. If you would like Amazon
     * Redshift to identify the Event Bridge rule, and present it in the Amazon Redshift console,
     * append a `QS2-` prefix to the statement name.
     *
     * Default: - No statement name is specified
     *
     * @param statementName The name of the SQL statement. 
     */
    public fun statementName(statementName: String)
  }

  private class BuilderImpl(
    clusterArn: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.RedshiftQuery.Builder =
        software.amazon.awscdk.services.events.targets.RedshiftQuery.Builder.create(clusterArn)

    /**
     * The Amazon Redshift database to run the query against.
     *
     * @param database The Amazon Redshift database to run the query against. 
     */
    override fun database(database: String) {
      cdkBuilder.database(database)
    }

    /**
     * The Amazon Redshift database user to run the query as.
     *
     * This is required when authenticating via temporary credentials.
     *
     * Default: - No Database user is specified
     *
     * @param dbUser The Amazon Redshift database user to run the query as. 
     */
    override fun dbUser(dbUser: String) {
      cdkBuilder.dbUser(dbUser)
    }

    /**
     * The queue to be used as dead letter queue.
     *
     * Default: - No dead letter queue is specified
     *
     * @param deadLetterQueue The queue to be used as dead letter queue. 
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * The input to the state machine execution.
     *
     * Default: - the entire EventBridge event
     *
     * @param input The input to the state machine execution. 
     */
    override fun input(input: RuleTargetInput) {
      cdkBuilder.input(input.let(RuleTargetInput.Companion::unwrap))
    }

    /**
     * The IAM role to be used to execute the SQL statement.
     *
     * Default: - a new role will be created.
     *
     * @param role The IAM role to be used to execute the SQL statement. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * The secret containing the password for the database user.
     *
     * This is required when authenticating via Secrets Manager.
     * If the full secret ARN is not specified, this will instead use the secret name.
     *
     * Default: - No secret is specified
     *
     * @param secret The secret containing the password for the database user. 
     */
    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret.Companion::unwrap))
    }

    /**
     * Should an event be sent back to Event Bridge when the SQL statement is executed.
     *
     * Default: false
     *
     * @param sendEventBridgeEvent Should an event be sent back to Event Bridge when the SQL
     * statement is executed. 
     */
    override fun sendEventBridgeEvent(sendEventBridgeEvent: Boolean) {
      cdkBuilder.sendEventBridgeEvent(sendEventBridgeEvent)
    }

    /**
     * The SQL queries to be executed.
     *
     * Each query is run sequentially within a single transaction; the next query in the array will
     * only execute after the previous one has successfully completed.
     *
     * * When multiple sql queries are included, this will use the `batchExecuteStatement` API.
     * Therefore, if any statement fails, the entire transaction is rolled back.
     * * If a single SQL statement is to be executed, this will use the `executeStatement` API.
     *
     * Default: - No SQL query is specified
     *
     * @param sql The SQL queries to be executed. 
     */
    override fun sql(sql: List<String>) {
      cdkBuilder.sql(sql)
    }

    /**
     * The SQL queries to be executed.
     *
     * Each query is run sequentially within a single transaction; the next query in the array will
     * only execute after the previous one has successfully completed.
     *
     * * When multiple sql queries are included, this will use the `batchExecuteStatement` API.
     * Therefore, if any statement fails, the entire transaction is rolled back.
     * * If a single SQL statement is to be executed, this will use the `executeStatement` API.
     *
     * Default: - No SQL query is specified
     *
     * @param sql The SQL queries to be executed. 
     */
    override fun sql(vararg sql: String): Unit = sql(sql.toList())

    /**
     * The name of the SQL statement.
     *
     * You can name the SQL statement for identitfication purposes. If you would like Amazon
     * Redshift to identify the Event Bridge rule, and present it in the Amazon Redshift console,
     * append a `QS2-` prefix to the statement name.
     *
     * Default: - No statement name is specified
     *
     * @param statementName The name of the SQL statement. 
     */
    override fun statementName(statementName: String) {
      cdkBuilder.statementName(statementName)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.RedshiftQuery =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(clusterArn: String, block: Builder.() -> Unit = {}): RedshiftQuery {
      val builderImpl = BuilderImpl(clusterArn)
      return RedshiftQuery(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.RedshiftQuery):
        RedshiftQuery = RedshiftQuery(cdkObject)

    internal fun unwrap(wrapped: RedshiftQuery):
        software.amazon.awscdk.services.events.targets.RedshiftQuery = wrapped.cdkObject as
        software.amazon.awscdk.services.events.targets.RedshiftQuery
  }
}
