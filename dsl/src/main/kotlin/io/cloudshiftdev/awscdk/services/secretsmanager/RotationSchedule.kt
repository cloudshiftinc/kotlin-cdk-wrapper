package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class RotationSchedule
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.secretsmanager.RotationSchedule,
) : Resource(cdkObject) {
    /** A fluent builder for [io.cloudshiftdev.awscdk.services.secretsmanager.RotationSchedule]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Specifies the number of days after the previous rotation before Secrets Manager triggers
         * the next automatic rotation.
         *
         * The minimum value is 4 hours. The maximum value is 1000 days.
         *
         * A value of zero (`Duration.days(0)`) will not create RotationRules.
         *
         * Default: Duration.days(30)
         *
         * @param automaticallyAfter Specifies the number of days after the previous rotation before
         *   Secrets Manager triggers the next automatic rotation.
         */
        public fun automaticallyAfter(automaticallyAfter: Duration)

        /**
         * Hosted rotation.
         *
         * Default: - either `rotationLambda` or `hostedRotation` must be specified
         *
         * @param hostedRotation Hosted rotation.
         */
        public fun hostedRotation(hostedRotation: HostedRotation)

        /**
         * Specifies whether to rotate the secret immediately or wait until the next scheduled
         * rotation window.
         *
         * Default: true
         *
         * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or
         *   wait until the next scheduled rotation window.
         */
        public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean)

        /**
         * A Lambda function that can rotate the secret.
         *
         * Default: - either `rotationLambda` or `hostedRotation` must be specified
         *
         * @param rotationLambda A Lambda function that can rotate the secret.
         */
        public fun rotationLambda(rotationLambda: IFunction)

        /**
         * The secret to rotate.
         *
         * If hosted rotation is used, this must be a JSON string with the following format:
         * ```
         * {
         * "engine": &lt;required: database engine&gt;,
         * "host": &lt;required: instance host name&gt;,
         * "username": &lt;required: username&gt;,
         * "password": &lt;required: password&gt;,
         * "dbname": &lt;optional: database name&gt;,
         * "port": &lt;optional: if not specified, default port will be used&gt;,
         * "masterarn": &lt;required for multi user rotation: the arn of the master secret which will be
         * used to create users/change passwords&gt;
         * }
         * ```
         *
         * This is typically the case for a secret referenced from an
         * `AWS::SecretsManager::SecretTargetAttachment` or an `ISecret` returned by the `attach()`
         * method of `Secret`.
         *
         * @param secret The secret to rotate.
         */
        public fun secret(secret: ISecret)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.secretsmanager.RotationSchedule.Builder =
            software.amazon.awscdk.services.secretsmanager.RotationSchedule.Builder.create(
                scope,
                id
            )

        /**
         * Specifies the number of days after the previous rotation before Secrets Manager triggers
         * the next automatic rotation.
         *
         * The minimum value is 4 hours. The maximum value is 1000 days.
         *
         * A value of zero (`Duration.days(0)`) will not create RotationRules.
         *
         * Default: Duration.days(30)
         *
         * @param automaticallyAfter Specifies the number of days after the previous rotation before
         *   Secrets Manager triggers the next automatic rotation.
         */
        override fun automaticallyAfter(automaticallyAfter: Duration) {
            cdkBuilder.automaticallyAfter(automaticallyAfter.let(Duration::unwrap))
        }

        /**
         * Hosted rotation.
         *
         * Default: - either `rotationLambda` or `hostedRotation` must be specified
         *
         * @param hostedRotation Hosted rotation.
         */
        override fun hostedRotation(hostedRotation: HostedRotation) {
            cdkBuilder.hostedRotation(hostedRotation.let(HostedRotation::unwrap))
        }

        /**
         * Specifies whether to rotate the secret immediately or wait until the next scheduled
         * rotation window.
         *
         * Default: true
         *
         * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or
         *   wait until the next scheduled rotation window.
         */
        override fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
            cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
        }

        /**
         * A Lambda function that can rotate the secret.
         *
         * Default: - either `rotationLambda` or `hostedRotation` must be specified
         *
         * @param rotationLambda A Lambda function that can rotate the secret.
         */
        override fun rotationLambda(rotationLambda: IFunction) {
            cdkBuilder.rotationLambda(rotationLambda.let(IFunction::unwrap))
        }

        /**
         * The secret to rotate.
         *
         * If hosted rotation is used, this must be a JSON string with the following format:
         * ```
         * {
         * "engine": &lt;required: database engine&gt;,
         * "host": &lt;required: instance host name&gt;,
         * "username": &lt;required: username&gt;,
         * "password": &lt;required: password&gt;,
         * "dbname": &lt;optional: database name&gt;,
         * "port": &lt;optional: if not specified, default port will be used&gt;,
         * "masterarn": &lt;required for multi user rotation: the arn of the master secret which will be
         * used to create users/change passwords&gt;
         * }
         * ```
         *
         * This is typically the case for a secret referenced from an
         * `AWS::SecretsManager::SecretTargetAttachment` or an `ISecret` returned by the `attach()`
         * method of `Secret`.
         *
         * @param secret The secret to rotate.
         */
        override fun secret(secret: ISecret) {
            cdkBuilder.secret(secret.let(ISecret::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.secretsmanager.RotationSchedule =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): RotationSchedule {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return RotationSchedule(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.secretsmanager.RotationSchedule
        ): RotationSchedule = RotationSchedule(cdkObject)

        internal fun unwrap(
            wrapped: RotationSchedule
        ): software.amazon.awscdk.services.secretsmanager.RotationSchedule = wrapped.cdkObject
    }
}
